package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.UpdateQuery;
import model.CSA;

/**
 * Servlet implementation class UpdateCSA
 */
@WebServlet("/UpdateCSA")
public class UpdateCSA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCSA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CSA csa = new CSA(Integer.parseInt(request.getParameter("year")),request.getParameter("term"),Integer.parseInt(request.getParameter("callNumber")),request.getParameter("period"),request.getParameter("startTime"),request.getParameter("endTime"),request.getParameter("days"),Integer.parseInt(request.getParameter("FacultyID")),request.getParameter("name"));
		UpdateQuery uq = new UpdateQuery();
		uq.doUpdateCSA(csa);
		String url = "/CSAServlet";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
