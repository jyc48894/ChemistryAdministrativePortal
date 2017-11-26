package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {
	private Connection connection;
	int columnCount;
	/**
	 * Creating the DeleteQuery object which takes no parameters and connects to the local database.
	 * Change String liters "root" and "root" with respective "username" and "password" to work on your machine.
	 */
	public DeleteQuery() {
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
	
	public void doDeleteCSA(String tableName, String year, String term, String period) {
		 {
			String query = "DELETE FROM" + tableName+ "WHERE year = ? AND term = ? AND period = ?";
			try {
				PreparedStatement ps = this.connection.prepareStatement(query);
				ps.setString(1, year);
				ps.setString(2, term);
				ps.setString(3, period);
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	public void doDeleteCourse(String tableName, String name) {
		String query = "DELETE FROM" + tableName+ "WHERE name =?";
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setString(1, name);

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doDeleteFaculty(String tableName, String ID) {
		String query = "DELETE FROM" + tableName+ "WHERE UGA_ID =?";
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setString(1, ID);

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
	
}
