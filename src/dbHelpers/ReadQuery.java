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
		 * 
		 */
		public ReadQuery(String uname, String pwd) {
			String url = "jdbc:mysql://localhost:3306/chemistrydatabase";
			
			// set up the driver
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				this.connection = DriverManager.getConnection(url, uname, pwd);
				
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

		public void doRead(String table) {
			String query = "select * from ?";
			try {
				PreparedStatement ps = this.connection.prepareStatement(query);
				ps.setString(1, table);
				this.results = ps.executeQuery();
				rsmd = results.getMetaData();
				columnCount = rsmd.getColumnCount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public String createHTMLTable() {
			String table = "";
			table += "<table>";
			
			//Abstracting loop for pulling column name headings
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
			table += "</tr>";			
			
			//TODO think really hard here about how to implement pagination. Research required
			try {
				while(results.next()) {
					table += "<tr>";
					for(int i =1; i <= columnCount; i++) {
						table += "<td>" + results.getString(i) + "</td>";
					}
					table += "</tr>";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			table += "</table>";
			
			return table;
		}
}
