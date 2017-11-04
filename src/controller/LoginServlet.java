package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.UserHelper;
import model.User;
import utilities.PasswordService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/LoginHandler" })
public class LoginServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	private HttpSession session;
	private String url;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get the current session
		session = request.getSession();
		
		//Get fields from from
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//Encrypt password
		PasswordService pws = new PasswordService();
		String encryptedPass = pws.encrypt(password);
		
		//Create UserHelper to make database call, and call authenticate user method
		UserHelper uh = new UserHelper();
		User user = uh.authenticateUser(email, encryptedPass);
		
		if(user != null) {
			session.invalidate();
			session = request.getSession(true);
			session.setAttribute("user", user);
			url = "adminHome.jsp";
			
		}
		else {
			String errorMessage = "Unrecognized Username or Password";
			
			request.setAttribute("errorMessage", errorMessage);
			url = "index.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
