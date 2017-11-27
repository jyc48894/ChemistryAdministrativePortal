package dbHelpers;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import model.Course;
import model.CSA;
import model.Faculty;


public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
public ReadRecord() {
		
		String url = "jdbc:mysql://localhost:3306/chemistrydatabase";
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.connection = DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public Course doReadCourses(String name) {
	String query = "select * from courses where name = ?";
	Course course = new Course("na","na",0,"na");
	try {
		PreparedStatement ps = this.connection.prepareStatement(query);
		
		ps.setString(1, name);
		
		this.results  = ps.executeQuery();
		this.results.next();
		course.setName(name);
		course.setCredits(this.results.getInt("credits"));
		course.setDivision(this.results.getString("division"));
		course.setTitle(this.results.getString("title"));
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return course;
	
}

public CSA doReadCSA(String year, String term, String period) {
	String query = "select * from course_selection_assignments where year =?, term = ?, period = ?";
	CSA csa = new CSA(0,"0",0,"0","0","0","0",0,"0");
	try {
		PreparedStatement ps = this.connection.prepareStatement(query);
		
		ps.setString(1, year);
		ps.setString(2, term);
		ps.setString(3, period);
		
		this.results= ps.executeQuery();
		this.results.next();
		csa.setYear(this.results.getInt("year"));
		csa.setTerm(this.results.getString("term"));
		csa.setCallNumber(this.results.getInt("callNumber"));
		csa.setPeriod(this.results.getString("period"));
		csa.setStartTime(this.results.getString("startTime"));
		csa.setEndTime(this.results.getString("endTime"));
		csa.setDays(this.results.getString("days"));
		csa.setFacultyID(this.results.getInt("Faculty_UGA_ID"));
		csa.setName(this.results.getString("Courses_name"));
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return csa;
	
}

public Faculty doReadFaculty(String ID) {
	String query = "select * from faculty where UGA_ID = ?";
	Faculty faculty = new Faculty(0,"0","0","0","0","0");
	try {
		PreparedStatement ps = this.connection.prepareStatement(query);
		
		ps.setString(1, ID);
		
		this.results= ps.executeQuery();
		this.results.next();
		faculty.setId(this.results.getInt("UGA_ID"));
		faculty.setFirstName("FirstName");
		faculty.setLastName(this.results.getString("LastName"));
		faculty.setTitle(this.results.getString("Title"));
		faculty.setLoad(this.results.getString("TeachingLoad"));
		faculty.setMyID(this.results.getString("UGA_MyID"));
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return faculty;
	
}

}
