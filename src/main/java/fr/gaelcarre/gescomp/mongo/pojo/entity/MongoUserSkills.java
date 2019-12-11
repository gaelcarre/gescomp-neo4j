package fr.gaelcarre.gescomp.mongo.pojo.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userskills")
public class MongoUserSkills {

	@Id
	private ObjectId _id;
	private ObjectId skill;
	private ObjectId user;
	private Integer level;

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
	 * @return the skill
	 */
	public ObjectId getSkill() {
		return this.skill;
	}

	/**
	 * @param skill
	 *            the skill to set
	 */
	public void setSkill(ObjectId skill) {
		this.skill = skill;
	}

	/**
	 * @return the user
	 */
	public ObjectId getUser() {
		return this.user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(ObjectId user) {
		this.user = user;
	}

	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return this.level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

}
