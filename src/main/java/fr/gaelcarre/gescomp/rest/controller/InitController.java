package fr.gaelcarre.gescomp.rest.controller;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.gaelcarre.gescomp.mapping.CompetenceMapper;
import fr.gaelcarre.gescomp.mapping.UtilisateurMapper;
import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoCompetence;
import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoUserSkills;
import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoUtilisateur;
import fr.gaelcarre.gescomp.mongo.repository.MongoCompetenceRepository;
import fr.gaelcarre.gescomp.mongo.repository.MongoUserSkillsRepository;
import fr.gaelcarre.gescomp.mongo.repository.MongoUtilisateurRepository;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Agence;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Competence;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Site;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Utilisateur;
import fr.gaelcarre.gescomp.neo4j.pojo.relation.ACompetence;
import fr.gaelcarre.gescomp.neo4j.pojo.relation.EstComposeeDe;
import fr.gaelcarre.gescomp.neo4j.repository.ACompetenceRepository;
import fr.gaelcarre.gescomp.neo4j.repository.CompetenceRepository;
import fr.gaelcarre.gescomp.neo4j.repository.DataBaseRepository;
import fr.gaelcarre.gescomp.neo4j.repository.EstComposeeDeRepository;
import fr.gaelcarre.gescomp.neo4j.repository.UtilisateurRepository;
import fr.gaelcarre.gescomp.util.LocalStorage;

@Component
public class InitController {

	private Logger logger = LoggerFactory.getLogger(InitController.class);

	private String url = "csv/v1";

	@Autowired
	private UtilisateurMapper utilisateurMapper;
	@Autowired
	private MongoUtilisateurRepository mongoUtilisateurRepository;
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Autowired
	private CompetenceMapper competenceMapper;
	@Autowired
	private MongoCompetenceRepository mongoCompetenceRepository;
	@Autowired
	private CompetenceRepository competenceRepository;

	@Autowired
	private MongoUserSkillsRepository mongoUserSkillsRepository;

	@Autowired
	private DataBaseRepository dataBaseRepository;
	@Autowired
	private EstComposeeDeRepository estCompetenceRepository;
	@Autowired
	private ACompetenceRepository aCompetenceRepository;

	@Transactional
	public void init() {

		this.logger.debug("Init dataset");

		purge();

		processCompetences();
		processUtilisateurs();
		processEstComposeeDe();
		processACompetence();

	}

	private void processACompetence() {

		for (MongoUserSkills mus : this.mongoUserSkillsRepository.findAll()) {
			ACompetence ac = new ACompetence();
			ac.setCompetence(LocalStorage.competences.get(mus.getSkill()));
			ac.setUtilisateur(LocalStorage.utilisateurs.get(mus.getUser()));
			ac.setNiveau(mus.getLevel());
			if (LocalStorage.competences.containsKey(mus.getSkill())
					&& LocalStorage.utilisateurs.containsKey(mus.getUser()))
				this.aCompetenceRepository.save(ac);
		}

	}

	private void processEstComposeeDe() {
		for (MongoCompetence mc : this.mongoCompetenceRepository.findAll()) {
			Competence c = LocalStorage.competences.get(mc.get_id());

			if (mc.getChildrenskill() != null)
				for (ObjectId child : mc.getChildrenskill()) {
					Competence neochild = LocalStorage.competences.get(child);
					EstComposeeDe ecd = new EstComposeeDe();
					ecd.setCompetence(c);
					ecd.setSousCompetence(neochild);
					this.estCompetenceRepository.save(ecd);
				}

			if (mc.getParentskill() != null) {
				Competence neoparent = LocalStorage.competences.get(mc.getParentskill());
				EstComposeeDe ecd = new EstComposeeDe();
				ecd.setCompetence(neoparent);
				ecd.setSousCompetence(c);
				this.estCompetenceRepository.save(ecd);
			}

		}

	}

	private void processCompetences() {

		for (MongoCompetence mc : this.mongoCompetenceRepository.findAll()) {
			Competence c = this.competenceMapper.mapperCompetence(mc);
			if (!LocalStorage.competences.containsKey(mc.get_id()))
				LocalStorage.competences.put(mc.get_id(), c);

			this.competenceRepository.save(c);
		}

	}

	private void processUtilisateurs() {

		for (MongoUtilisateur mu : this.mongoUtilisateurRepository.findAll()) {
			Utilisateur u = this.utilisateurMapper.mapperUtilisateur(mu);

			if (mu.getDepartment() != null) {
				if (!LocalStorage.agences.containsKey(mu.getDepartment().toUpperCase())) {
					Agence a = new Agence();
					a.setNom(mu.getDepartment().toUpperCase());
					LocalStorage.agences.put(mu.getDepartment().toUpperCase(), a);
				}

				u.setAgence(LocalStorage.agences.get(mu.getDepartment().toUpperCase()));
			}

			if (mu.getAgency() != null) {
				if (!LocalStorage.sites.containsKey(mu.getAgency().toUpperCase())) {
					Site s = new Site();
					s.setNom(mu.getAgency().toUpperCase());
					LocalStorage.sites.put(mu.getAgency().toUpperCase(), s);
				}

				u.setSite(LocalStorage.sites.get(mu.getAgency().toUpperCase()));
			}

			this.utilisateurRepository.save(u);
			LocalStorage.utilisateurs.put(mu.get_id(), u);
		}
	}

	@Transactional
	private void purge() {
		this.dataBaseRepository.purge();
	}

}
