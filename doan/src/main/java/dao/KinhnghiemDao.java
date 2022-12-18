package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DbCon;
import model.kinhnghiem;
public class KinhnghiemDao {
	Connection con = null;
	PreparedStatement stm = null;
	ResultSet rs ;
    public List<kinhnghiem> getKinhNghiemById(String id)
    {
    	List<kinhnghiem> list = new ArrayList<kinhnghiem>();
    	String query = "SELECT * FROM doan.kinhnghiem where `idcv` = ?";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, id);
			rs = stm.executeQuery();
			while(rs.next())
			{
				list.add(new kinhnghiem(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
    	
    }
    public void UpdateKinhNghiem(String idkn,String nameda, String kythuat, String mota )
    {
    	String query = "UPDATE `doan`.`kinhnghiem` SET `nameda` = ?, `kythuat` = ?, `mota` = ? WHERE (`idkn` = ?)";
    	try {
			con = DbCon.getConnection();
			stm = con.prepareStatement(query);
			stm.setString(1, nameda);
			stm.setString(2, kythuat);
			stm.setString(3, mota);
			stm.setString(4, idkn);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public kinhnghiem getKinhNghiemByIdKn(String id)
    {
    	String query = "SELECT * FROM doan.kinhnghiem where `idkn` = ?";
    	try {
			con = DbCon.getConnection();
    	stm = con.prepareStatement(query);
    	stm.setString(1, id);
    	rs = stm.executeQuery();
    	while(rs.next())
    	{
    		new kinhnghiem(rs.getInt(1),
    				rs.getString(2),
    				rs.getString(3),
    				rs.getString(4),
    				rs.getInt(5));
    	}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
		return null;
    	
    }
}
