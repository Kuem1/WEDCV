package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbCon;
import model.user;

public class UserDao {
	Connection con = null;
	  PreparedStatement stm = null;
	  ResultSet rs = null;
  public user login(String username, String password)
  {
	 String query = "SELECT * FROM doan.user where `username` = ? and `password` = ?";
	 try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1, username);
		stm.setString(2, password);
		rs = stm.executeQuery();
		while(rs.next())
		{
			return new user(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4));
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	 
	return null;
	  
  }
	  
  public void SignIn(String username, String password, String email)
  {
	  String query= "INSERT INTO `doan`.`user` (`username`, `password`, `email`) VALUES (?, ?, ?)";
	  try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1, username);
		stm.setString(2, password);
		stm.setString(3, email);
		stm.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  public user ForgotPassword(String email) {
	  String query= "SELECT * FROM doan.user where `email` = ?";
	  try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1, email);
		rs = stm.executeQuery();
		while(rs.next())
		{
			return new user(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4));
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	  return null;
  }
  public void ChangeFgPassword(String password, String id)
  {
	  String query= "UPDATE `doan`.`user` SET `password` = ? WHERE (`idu` = ?)";
	  try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1, password);
		stm.setString(2, id);
		stm.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  public user CheckPassword(String password , String id) {
	  String query= "SELECT * FROM doan.user where `idu` = ? and `password` = ? " ;
	  try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		stm.setString(1, id);
		stm.setString(2, password);
		rs = stm.executeQuery();
		while(rs.next())
		{
			return new user(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4));
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	  return null;
  }
  public List<user> GetAllUser()
  {
	  String query = "SELECT * FROM doan.user";
	  List<user> list = new ArrayList<>();
	  try {
		con = DbCon.getConnection();
		stm = con.prepareStatement(query);
		rs = stm.executeQuery();
		while(rs.next())
		{
			list.add(new user(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4)));
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	  return list;
  }
}
