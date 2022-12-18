package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.user;
import dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao dao = new UserDao();
        user u = dao.login(username, password);
			if(u != null)
			{
				System.out.print(username+password);
				HttpSession session = request.getSession();
				session.setAttribute("user", u);
				session.setMaxInactiveInterval(7200);
				request.getRequestDispatcher("search.jsp").forward(request, response);
			}
			else {
				request.setAttribute("err", "1");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		
		
			
	}

}
