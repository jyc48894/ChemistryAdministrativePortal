package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.CSA;

/**
 * Servlet implementation class AddCSAServlet
 */

@WebServlet(
		description = "Controller for adding a new CSA to the db", 
		urlPatterns = { 
				"/AddCSAServlet", 
				"/addCSA"
		})
public class AddCSAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCSAServlet() {
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
		// TODO Auto-generated method stub
		int year = Integer.parseInt(request.getParameter("year"));
		String term = request.getParameter("term");
		int callNumber = Integer.parseInt(request.getParameter("callNumber"));
		String period = request.getParameter("period");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String days = request.getParameter("days");
		int facultyID = Integer.parseInt(request.getParameter("facultyID"));
		String name = request.getParameter("name");

		
		
		// set up a CSA object
		CSA csa = new CSA(year,  term, callNumber, period, startTime, endTime, days,
				facultyID, name); 
		
		// set up an addQuery object
		AddQuery aq = new AddQuery("chemistrydatabase", "root", "");   //Removed password for security reasons
		
		// pass the CSA to addQuery to add to the database
		aq.doAddCSA(csa);
		
		// pass the execution control to the ReadServlet
		String url = "/CSAServlet";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
