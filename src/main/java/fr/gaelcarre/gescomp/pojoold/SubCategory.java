package fr.gaelcarre.gescomp.pojoold;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@RelationshipEntity(type = "CATEGORIZED_UNDER")
public class SubCategory {
	@Id
	@GeneratedValue
	private Long id;
	@StartNode
	@JsonIgnore
	Category start;
	@EndNode
	Category end;

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
	 * @return the start
	 */
	public Category getStart() {
		return this.start;
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public void setStart(Category start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public Category getEnd() {
		return this.end;
	}

	/**
	 * @param end
	 *            the end to set
	 */
	public void setEnd(Category end) {
		this.end = end;
	}

}
