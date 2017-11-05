package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ReadQuery {

		private Connection connection;
		private ResultSet results;
		private ResultSetMetaData rsmd;
		int columnCount;
		/**
		 * Creating the ReadQuery object which takes no parameters and connects to the local database.
		 * Change String liters "root" and "root" with respective "username" and "password" to work on your machine.
		 */
		public ReadQuery() {
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
		/**
		 * Read the correct passed in tableName and check against allowed searches to prevent sql injection attack.
		 * Create ResultSet object to store query results, and create ResultSetMetaData object to store table and 
		 * column information.
		 * @param tableName
		 */
		public void doRead(String tableName) {
			if(tableName.equals("course_section_assignments") || tableName.equals("faculty") || tableName.equals("courses")) {
				String query = "select * from " + tableName;
				try {
					PreparedStatement ps = this.connection.prepareStatement(query);
					this.results = ps.executeQuery();
					rsmd = results.getMetaData();
					columnCount = rsmd.getColumnCount();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		/**
		 * Create the String containing the HTML code for the table to be displayed along with appending an additional
		 * add entry hyperlink at the bottom that contains the data to auto-generate a form with the correct text
		 * fields to pass into the AddServlet
		 * @return
		 */
		public String createHTMLTable() {
			String table = "";
			table += "<table id='table'>";
			
			//Abstracting loop for pulling column name headings
			table += "<thead>";
			table += "<tr>";
			for(int i =1; i <= columnCount; i++) {
				try {
					//Makes column's first character uppercase and adds to headers
					table += "<th>" + rsmd.getColumnName(i).substring(0, 1).toUpperCase() + rsmd.getColumnName(i).substring(1).toLowerCase()  + "</th>";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			table += "<th>Update Entry</th>";
			table += "<th>Delete Entry</th>";
			table += "</tr>";			
			table += "</thead>";
			
			table += "<tbody>";
			try {
				while(results.next()) {
					table += "<tr>";
					for(int i =1; i <= columnCount; i++) {
						table += "<td>" + results.getString(i) + "</td>";
					}
					//TODO add in parameters for update page and delete functionality (delete will call DeleteServlet that forwards back to ReadServlet
					table += "<td><a href='update.jsp'>Update</a>";
					table += "<td><a href='DeleteServlet'>Delete</a>";
					table += "</tr>";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			table += "</tbody>";
			table += "</table>";
			//Think about how to pass parameters to send user to a correct add page
			//try {
				//Figure this out with after jquery stuff later table += "<a href='add.jsp'>Add</a> a " + rsmd.getTableName(1) + " entry";
			//} catch (SQLException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
			
			return table;
		}
}
