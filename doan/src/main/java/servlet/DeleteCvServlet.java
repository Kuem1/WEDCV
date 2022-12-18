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
 * Servlet implementation class DeleteCvServlet
 */
@WebServlet("/DeleteCvServlet")
public class DeleteCvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idcv");
		CvDao dao = new CvDao();
		dao.deleteCv(id);
		String idu = request.getParameter("idu");
	    List<cv> list = dao.getCvbyid(idu);
	    request.setAttribute("cv", list);
		request.getRequestDispatcher("cv.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
