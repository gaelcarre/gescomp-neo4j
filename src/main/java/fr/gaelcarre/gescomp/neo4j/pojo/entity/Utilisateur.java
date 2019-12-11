package fr.gaelcarre.gescomp.neo4j.pojo.entity;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.id.InternalIdStrategy;
import org.springframework.lang.Nullable;

import fr.gaelcarre.gescomp.neo4j.pojo.relation.ACompetence;
import fr.gaelcarre.gescomp.neo4j.pojo.relation.Travaille;

@NodeEntity(label = "utilisateur")
public class Utilisateur {

	private @Id @GeneratedValue(strategy = InternalIdStrategy.class) Long id;
	private String nom;
	private String prenom;
	private String badge;
	@Nullable
	@Relationship(type = "A_COMPETENCE")
	private Set<ACompetence> competences;
	@Nullable
	@Relationship(type = "HABITE")
	private Set<Travaille> projets;
	@Relationship(type = "A_L_AGENCE")
	private Agence agence;
	@Relationship(type = "SUR_SITE")
	private Site site;

	/**
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the badge
	 */
	public String getBadge() {
		return this.badge;
	}

	/**
	 * @param badge
	 *            the badge to set
	 */
	public void setBadge(String badge) {
		this.badge = badge;
	}

	/**
	 * @return the competences
	 */
	public Set<ACompetence> getCompetences() {
		if (this.competences == null)
			this.competences = new HashSet<>();
		return this.competences;
	}

	/**
	 * @param competences
	 *            the competences to set
	 */
	public void setCompetences(Set<ACompetence> competences) {
		this.competences = competences;
	}

	/**
	 * @return the projets
	 */
	public Set<Travaille> getProjets() {
		return this.projets;
	}

	/**
	 * @param projets
	 *            the projets to set
	 */
	public void setProjets(Set<Travaille> projets) {
		this.projets = projets;
	}

	/**
	 * @return the agence
	 */
	public Agence getAgence() {
		return this.agence;
	}

	/**
	 * @param agence
	 *            the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	/**
	 * @return the site
	 */
	public Site getSite() {
		return this.site;
	}

	/**
	 * @param site
	 *            the site to set
	 */
	public void setSite(Site site) {
		this.site = site;
	}

}
