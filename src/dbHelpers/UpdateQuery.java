package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Course;
import model.CSA;
import model.Faculty;

public class UpdateQuery {
	
	Connection connection;

	public UpdateQuery() {
		
		String url = "jdbc:mysql://localhost:3306/chemistrydatabase";	
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, "root", "root");
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doUpdateCourse(Course course) {
		String query = "update courses set title = ?, division = ?, credits = ?, where name = ?";
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			
			ps.setString(1, course.getTitle());
			ps.setString(2, course.getDivision());
			ps.setInt(3, course.getCredits());
			ps.setString(4, course.getName());

			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doUpdateCSA(CSA csa) {
		String query = "update course_section_assignment set callNumber = ?, startTime = ?, endTime = ?, days = ? where year = ?, term = ?, period = ?, Faculty_UGA_ID = ?, Courses_name = ?";
		try {
		PreparedStatement ps = this.connection.prepareStatement(query);
		

		ps.setInt(1,csa.getCallNumber());
		ps.setString(2,csa.getStartTime());
		ps.setString(3,csa.getEndTime());
		ps.setString(4,csa.getDays());
		ps.setInt(5, csa.getYear());
		ps.setString(6, csa.getTerm());
		ps.setString(7,csa.getPeriod());
		ps.setInt(8,csa.getFacultyID());
		ps.setString(9, csa.getName());

		
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public void doUpdateFaculty(Faculty faculty) {
		String query = "update faculty set FirstName = ?, LastName = ?, Title = ?, TeachingLoad = ?, UGA_MyID = ? where UGA_ID = ?";
		try {
		PreparedStatement ps = this.connection.prepareStatement(query);
		

ps.setString(1, faculty.getFirstName());
ps.setString(2, faculty.getLastName());
ps.setString(3, faculty.getTitle());
ps.setString(4, faculty.getLoad());
ps.setString(5, faculty.getMyID());
ps.setInt(6, faculty.getId());

		
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				
				
		
	}
	
}
