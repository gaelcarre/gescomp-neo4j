package fr.gaelcarre.gescomp.neo4j.pojo.relation;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.gaelcarre.gescomp.neo4j.pojo.entity.Projet;
import fr.gaelcarre.gescomp.neo4j.pojo.entity.Utilisateur;

@RelationshipEntity(type = "TRAVAILLE")
public class Travaille {

	@Id
	@GeneratedValue
	private Long id;
	@StartNode
	@JsonIgnore
	private Utilisateur utilisateur;
	@EndNode
	private Projet projet;

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
	 * @return the projet
	 */
	public Projet getProjet() {
		return this.projet;
	}

	/**
	 * @param projet
	 *            the projet to set
	 */
	public void setProjet(Projet projet) {
		this.projet = projet;
	}

}
