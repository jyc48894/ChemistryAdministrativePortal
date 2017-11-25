package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Faculty;

/**
 * Servlet implementation class AddFacultyServlet
 */
@WebServlet(
		description = "Controller for adding a new Faculty to the db", 
		urlPatterns = { 
				"/AddFacultyServlet", 
				"/addFaculty"
		})
public class AddFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFacultyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 	int id = Integer.parseInt(request.getParameter("id")); 
	 	String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String title = request.getParameter("title");
		String load = request.getParameter("load");
		String myID = request.getParameter("myID");


		
		
		// set up a Faculty object
		Faculty faculty = new Faculty(id, firstName, lastName, title, load, myID);

		
		// set up an addQuery object
		AddQuery aq = new AddQuery("chemistrydatabase", "root", "");   //Removed password for security reasons
		
		// pass the faculty to addQuery to add to the database
		aq.doAddFaculty(faculty);
		
		// pass the execution control to the ReadServlet
		String url = "/FacultyServlet";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
