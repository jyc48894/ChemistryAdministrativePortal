package model;

public class CSA {
	
	private int year;
	private String term;
	private int callNumber;
	private String period; 
	private String startTime; 
	private String endTime; 
	private String days; 
	private int facultyID;
	private String name;
	/**
	 * @param year
	 * @param term
	 * @param callNumber
	 * @param period
	 * @param startTime
	 * @param endtime
	 * @param days
	 * @param facultyID
	 * @param name
	 */
	public CSA(int year, String term, int callNumber, String period, String startTime, String endTime, String days,
			int facultyID, String name) {
		this.year = year;
		this.term = term;
		this.callNumber = callNumber;
		this.period = period;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
		this.facultyID = facultyID;
		this.name = name;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the term
	 */
	public String getTerm() {
		return term;
	}
	/**
	 * @param term the term to set
	 */
	public void setTerm(String term) {
		this.term = term;
	}
	/**
	 * @return the callNumber
	 */
	public int getCallNumber() {
		return callNumber;
	}
	/**
	 * @param callNumber the callNumber to set
	 */
	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}
	/**
	 * @return the period
	 */
	public String getPeriod() {
		return period;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(String period) {
		this.period = period;
	}
	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endtime
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * @param endtime the endtime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the days
	 */
	public String getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(String days) {
		this.days = days;
	}
	/**
	 * @return the facultyID
	 */
	public int getFacultyID() {
		return facultyID;
	}
	/**
	 * @param facultyID the facultyID to set
	 */
	public void setFacultyID(int facultyID) {
		this.facultyID = facultyID;
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
	

}
