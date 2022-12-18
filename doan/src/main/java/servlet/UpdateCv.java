package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CvDao;
import model.cv;

/**
 * Servlet implementation class UpdateCv
 */
@WebServlet("/UpdateCv")
public class UpdateCv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String hobby = request.getParameter("hobby");
		String idcv = request.getParameter("idcv");
		CvDao dao = new CvDao();
		dao.updateCv(idcv, name, email, phone, hobby);
		cv list = dao.getCvbyidcv(idcv);
		request.setAttribute("cv", list);
		request.getRequestDispatcher("ShowCv.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
