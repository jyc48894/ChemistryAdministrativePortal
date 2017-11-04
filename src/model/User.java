package model;

public class User {
	private String email;
	private String password;
	private String addedOrUpdated;
	/**
	 * @param email
	 * @param password
	 * @param lastUpdated
	 */
	public User(String email, String password, String addedOrUpdated) {
		this.email = email;
		this.password = password;
		this.addedOrUpdated = addedOrUpdated;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the lastUpdated
	 */
	public String getAddedOrUpdated() {
		return addedOrUpdated;
	}
	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(String addedOrUpdated) {
		this.addedOrUpdated = addedOrUpdated;
	}

}
