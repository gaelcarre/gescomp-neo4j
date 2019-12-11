package fr.gaelcarre.gescomp.mongo.pojo.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class MongoUtilisateur {

	private @Id ObjectId _id;
	private String username;
	private String name;
	private String lastname;
	private Boolean isadmin;
	private Boolean ismanager;
	private String agency;
	private String country;
	private String department;
	private String employeeID;
	private String mail;

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
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @return the lastname
	 */
	public String getLastname() {
		return this.lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the isadmin
	 */
	public Boolean getIsadmin() {
		return this.isadmin;
	}

	/**
	 * @param isadmin
	 *            the isadmin to set
	 */
	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	/**
	 * @return the ismanager
	 */
	public Boolean getIsmanager() {
		return this.ismanager;
	}

	/**
	 * @param ismanager
	 *            the ismanager to set
	 */
	public void setIsmanager(Boolean ismanager) {
		this.ismanager = ismanager;
	}

	/**
	 * @return the agency
	 */
	public String getAgency() {
		return this.agency;
	}

	/**
	 * @param agency
	 *            the agency to set
	 */
	public void setAgency(String agency) {
		this.agency = agency;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return this.department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the employeeID
	 */
	public String getEmployeeID() {
		return this.employeeID;
	}

	/**
	 * @param employeeID
	 *            the employeeID to set
	 */
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return this.mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

}
