package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.*;

public class AddQuery {
	
	Connection connection; 

	
	public AddQuery(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/"+dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd); 
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doAddCourse(Course course) {
		String query = "INSERT INTO chemistrydatabase.courses (name, title, credits, division) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, course.getName());
			ps.setString(2, course.getTitle());
			ps.setInt(3, course.getCredits());
			ps.setString(4, course.getDivision());
			
			ps.executeUpdate(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAddFaculty(Faculty faculty) {
		String query = "INSERT INTO chemistrydatabase.faculty (UGA_ID, FirstName, LastName, Title, TeachingLoad, UGA_MyID) VALUES (?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, faculty.getId());
			ps.setString(2, faculty.getFirstName());
			ps.setString(3, faculty.getLastName());
			ps.setString(4, faculty.getTitle());
			ps.setString(5, faculty.getLoad());
			ps.setString(6, faculty.getMyID());
			
			ps.executeUpdate(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAddCSA(CSA csa) {
		String query = "INSERT INTO chemistrydatabase.course_section_assignments (year, term, callNumber, period, startTime, endTime, days, Faculty_UGA_ID, Course_name) VALUES (?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, csa.getYear());
			ps.setString(2, csa.getTerm());
			ps.setInt(3, csa.getCallNumber());
			ps.setString(4, csa.getPeriod());
			ps.setString(5, csa.getStartTime());
			ps.setString(6, csa.getEndTime());
			ps.setString(7, csa.getDays());
			ps.setInt(8, csa.getFacultyID());
			ps.setString(9, csa.getName());
		
			
			ps.executeUpdate(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
