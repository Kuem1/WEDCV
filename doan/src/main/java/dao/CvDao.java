package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbCon;
import model.cv;

public class CvDao {
	Connection con = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
    public List<cv> getCvbyid(String id)
    {
    	List<cv> list = new ArrayList<cv>();
    	String query = "SELECT * FROM doan.cv where idu = ?";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, id);
			rs = stm.executeQuery();
			while(rs.next())
			{
				list.add( new cv(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
    	
    }
    public cv getCvbyidcv(String id)
    {
    	String query = "SELECT * FROM doan.cv where idcv = ?";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, id);
			rs = stm.executeQuery();
			while(rs.next())
			{
				return new cv(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
    	
    }
    public void deleteCv(String id)
    {
    	String query = "DELETE FROM `doan`.`cv` WHERE (`idcv` = ?);";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, id);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public void insertCv(String name, String email, String phone, String hobby, String idu)
    {
    	String query="INSERT INTO `doan`.`cv` (`name`, `email`, `phone`, `hobby`, `idu`) VALUES (?, ?, ?, ?, ?)";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, name);
			stm.setString(2, email);
			stm.setString(3, phone);
			stm.setString(4, hobby);
			stm.setString(5, idu);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public void updateCv(String idcv, String name, String email, String phone, String hobby)
    {
    	String query = "UPDATE `doan`.`cv` SET `name` = ?, `email` = ?, `phone` = ?, `hobby` = ? WHERE (`idcv` = ?)";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, name);
			stm.setString(2, email);
			stm.setString(3, phone);
			stm.setString(4, hobby);
			stm.setString(5, idcv);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
