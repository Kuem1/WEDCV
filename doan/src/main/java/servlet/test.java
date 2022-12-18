package servlet;

import java.util.List;

import dao.CvDao;
import dao.KinhnghiemDao;
import dao.UserDao;
import model.cv;
import model.kinhnghiem;
import model.user;

public class test {
	   public static void main(String[] args)
	   {
		   UserDao dao = new UserDao();
			List<user> list = dao.GetAllUser();
			for(user o : list) {
		   System.out.print(o);
			}
	   }
}