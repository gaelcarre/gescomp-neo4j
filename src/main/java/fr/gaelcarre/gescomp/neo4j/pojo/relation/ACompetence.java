package fr.gaelcarre.gescomp.neo4j.pojo.relation;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateString;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.gaelcarre.gescomp.neo4j.pojo.entity.Competence;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Utilisateur;

@RelationshipEntity(type = "A_COMPETENCE")
public class ACompetence {

	@Id
	@GeneratedValue
	private Long id;
	@StartNode
	@JsonIgnore
	private Utilisateur utilisateur;
	@EndNode
	private Competence competence;
	@Property
	private Integer niveau;
	@Property
	@DateString
	private Date date;

	/**
	 * @param utilisateur
	 * @param competence
	 * @param niveau
	 * @param date
	 */
	public ACompetence(Utilisateur utilisateur, Competence competence, Integer niveau, Date date) {
		super();
		this.utilisateur = utilisateur;
		this.competence = competence;
		this.niveau = niveau;
		this.date = date;
	}

	/**
	 *
	 */
	public ACompetence() {
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
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	/**
	 * @param utilisateur
	 *            the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
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
	 * @return the niveau
	 */
	public Integer getNiveau() {
		return this.niveau;
	}

	/**
	 * @param niveau
	 *            the niveau to set
	 */
	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}
