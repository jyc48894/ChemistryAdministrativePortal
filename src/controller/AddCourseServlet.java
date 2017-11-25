package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Course;


/**
 * Servlet implementation class AddCourseServlet
 */

@WebServlet(
		description = "Controller for adding a new Course to the db", 
		urlPatterns = { 
				"/AddCourseServlet", 
				"/addCourse"
		})
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseServlet() {
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
		
		// get the data
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			int credits = Integer.parseInt(request.getParameter("credits")); 
			String division= request.getParameter("division");
			
			
			
			// set up a Course object
			Course course = new Course(name, title, credits, division);
			
			// set up an addQuery object
			AddQuery aq = new AddQuery("chemistrydatabase", "root", "");   //Removed password for security reasons
			
			// pass the Course to addQuery to add to the database
			aq.doAddCourse(course);
			
			// pass the execution control to the ReadServlet
			String url = "/CourseServlet";
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
	}

}
