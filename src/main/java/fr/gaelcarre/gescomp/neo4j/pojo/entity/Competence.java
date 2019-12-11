package fr.gaelcarre.gescomp.neo4j.pojo.entity;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.id.InternalIdStrategy;

import fr.gaelcarre.gescomp.neo4j.pojo.relation.ACompetence;
import fr.gaelcarre.gescomp.neo4j.pojo.relation.EstComposeeDe;

@NodeEntity(label = "competence")
public class Competence {

	@Id
	@GeneratedValue(strategy = InternalIdStrategy.class)
	private Long id;

	private String nom;

	@Relationship(type = "EST_COMPOSEE_DE")
	private Set<EstComposeeDe> competences;

	@Relationship(type = "A_COMPETENCE")
	private Set<ACompetence> utilisateurs;

	/**
	 * @param id
	 * @param nom
	 * @param competences
	 * @param utilisateurs
	 */
	public Competence(Long id, String nom, Set<EstComposeeDe> competences, Set<ACompetence> utilisateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.competences = competences;
		this.utilisateurs = utilisateurs;
	}

	/**
	 * @param nom
	 */
	public Competence(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 *
	 */
	public Competence() {
		super();
	}

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
	 * @return the competences
	 */
	public Set<EstComposeeDe> getCompetences() {

		if (this.competences == null)
			this.competences = new HashSet<>();

		return this.competences;
	}

	/**
	 * @param competences
	 *            the competences to set
	 */
	public void setCompetences(Set<EstComposeeDe> competences) {
		this.competences = competences;
	}

	/**
	 * @return the utilisateurs
	 */
	public Set<ACompetence> getUtilisateurs() {

		if (this.utilisateurs == null)
			this.utilisateurs = new HashSet<>();

		return this.utilisateurs;
	}

	/**
	 * @param utilisateurs
	 *            the utilisateurs to set
	 */
	public void setUtilisateurs(Set<ACompetence> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
