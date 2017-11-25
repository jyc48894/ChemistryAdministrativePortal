package model;

public class Faculty {
	
	private int id;
	private String firstName;
	private String lastName;
	private String title;
	private String load; 
 	private String myID;
 	
 	
 	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param title
	 * @param load
	 * @param myID
	 */
	public Faculty(int id, String firstName, String lastName, String title, String load, String myID) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.load = load;
		this.myID = myID;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the load
	 */
	public String getLoad() {
		return load;
	}
	/**
	 * @param load the load to set
	 */
	public void setLoad(String load) {
		this.load = load;
	}
	/**
	 * @return the myID
	 */
	public String getMyID() {
		return myID;
	}
	/**
	 * @param myID the myID to set
	 */
	public void setMyID(String myID) {
		this.myID = myID;
	} 
 	
 	

}
