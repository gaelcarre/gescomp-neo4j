package fr.gaelcarre.gescomp.mapping;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import fr.gaelcarre.gescomp.mongo.pojo.entity.MongoUtilisateur;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Utilisateur;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public abstract class UtilisateurMapper {

	public Utilisateur mapperUtilisateur(MongoUtilisateur u) {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setBadge(u.getUsername());
		utilisateur.setNom(u.getLastname());
		utilisateur.setPrenom(u.getName());
		return utilisateur;
	}

	public abstract List<Utilisateur> mapperUtilisateurListe(List<MongoUtilisateur> us);

}
