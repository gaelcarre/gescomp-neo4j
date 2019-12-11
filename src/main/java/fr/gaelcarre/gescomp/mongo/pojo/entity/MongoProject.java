package fr.gaelcarre.gescomp.mongo.pojo.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "projects")
public class MongoProject {

	private @Id ObjectId _id;
	private String name;
	private String description;
	private List<ObjectId> skills;

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
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the skills
	 */
	public List<ObjectId> getSkills() {
		return this.skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(List<ObjectId> skills) {
		this.skills = skills;
	}

}
