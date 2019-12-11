package fr.gaelcarre.gescomp.mongo.pojo.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "skills")
public class MongoCompetence {

	@Id
	private ObjectId _id;

	private String name;

	@DBRef
	private List<ObjectId> childrenskill;
	@DBRef
	private ObjectId parentskill;

	/**
	 * @return the parentskill
	 */
	public ObjectId getParentskill() {
		return this.parentskill;
	}

	/**
	 * @param parentskill
	 *            the parentskill to set
	 */
	public void setParentskill(ObjectId parentskill) {
		this.parentskill = parentskill;
	}

	/**
	 * @return the _id
	 */
	public ObjectId get_id() {
		return this._id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the childrenskill
	 */
	public List<ObjectId> getChildrenskill() {
		return this.childrenskill;
	}

	/**
	 * @param childrenskill
	 *            the childrenskill to set
	 */
	public void setChildrenskill(List<ObjectId> childrenskill) {
		this.childrenskill = childrenskill;
	}

}