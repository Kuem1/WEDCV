package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KinhnghiemDao;
import model.kinhnghiem;

/**
 * Servlet implementation class GetKinhNghiemByIdKn
 */
@WebServlet("/GetKinhNghiemByIdKn")
public class GetKinhNghiemByIdKn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idkn");
		KinhnghiemDao dao = new KinhnghiemDao();
		kinhnghiem kn = dao.getKinhNghiemByIdKn(id);
		request.setAttribute("kn", kn);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
