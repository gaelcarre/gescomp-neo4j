package fr.gaelcarre.gescomp.neo4j.pojo.relation;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import fr.gaelcarre.gescomp.neo4j.pojo.entity.Competence;

@RelationshipEntity(type = "EST_COMPOSEE_DE")
public class EstComposeeDe {

	@Id
	@GeneratedValue
	private Long id;
	@StartNode
	private Competence competence;
	@EndNode
	private Competence sousCompetence;

	/**
	 * @param id
	 * @param competence
	 * @param sousCompetence
	 */
	public EstComposeeDe(Long id, Competence competence, Competence sousCompetence) {
		super();
		this.id = id;
		this.competence = competence;
		this.sousCompetence = sousCompetence;
	}

	/**
	 *
	 */
	public EstComposeeDe() {
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
	 * @return the competence
	 */
	public Competence getCompetence() {
		return this.competence;
	}

	/**
	 * @param competence
	 *            the competence to set
	 */
	public void setCompetence(Competence competence) {
		this.competence = competence;
	}

	/**
	 * @return the sousCompetence
	 */
	public Competence getSousCompetence() {
		return this.sousCompetence;
	}

	/**
	 * @param sousCompetence
	 *            the sousCompetence to set
	 */
	public void setSousCompetence(Competence sousCompetence) {
		this.sousCompetence = sousCompetence;
	}

}
