package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.user;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String password = request.getParameter("password");
	    String newpassword = request.getParameter("newpassword");
	    String id = request.getParameter("idu");
	    UserDao dao = new UserDao();
	    user u = dao.CheckPassword(password, id);
	    if(u != null)
	    {
	    	dao.ChangeFgPassword(newpassword, id);
	    	request.getRequestDispatcher("index.jsp").forward(request, response);
	    }
	    else {
			request.setAttribute("sms", "Sai password");
			request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
		}
	}

}
