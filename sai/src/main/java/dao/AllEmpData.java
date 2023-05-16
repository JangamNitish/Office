package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.AllEmployyPojo;

public class AllEmpData {
	String jsonquery = "SELECT * FROM alldetails";
	Connection conn = null;
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public AllEmployyPojo getEmployee(int id) throws SQLException {
		AllEmployyPojo Ae=new AllEmployyPojo();
		Connection conn = getConnection();
		PreparedStatement pstmt=conn.prepareStatement(jsonquery);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			Ae.setId(rs.getInt("id"));
			Ae.setEp(rs.getString("ep"));
			Ae.setSal(rs.getInt("sal"));
			Ae.setDep(rs.getString("dep"));
		}
		return Ae;
	}
	public List<Object> getall(){
		List<Object> list = new ArrayList<>();
		try(Connection c = getConnection();
				PreparedStatement preparedstatement = c.prepareStatement(jsonquery);){
				ResultSet rs = preparedstatement.executeQuery();
				while(rs.next()) {
					AllEmployyPojo e = new AllEmployyPojo(rs.getInt("id"),rs.getInt("sal"),rs.getString("ep"),rs.getString("dep"));
					list.add(e);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
