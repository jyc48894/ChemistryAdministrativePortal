package model;

public class Course {
	
	// Instantiate variables - matches the SQL variables
	private String name; 
	private String title;
	private int credits;
	private String division;
	
	
	/**
	 * @param name
	 * @param title
	 * @param credits
	 * @param division
	 */
	
	public Course(String name, String title, int credits, String division) {
		this.name = name;
		this.title = title;
		this.credits = credits;
		this.division = division;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}
	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {
		this.division = division;
	} 
	

}
