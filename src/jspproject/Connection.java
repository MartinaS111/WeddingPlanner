package jspproject;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.glavna;
import model.login;

public class Connection {
	public static boolean validate(login bean) throws SQLException{

		boolean status = false;
		try {
			String DRIVER="com.mysql.jdbc.Driver";
			String CONNECTION_URL="jdbc:mysql://localhost:3306/wedding";
			String USERNAME="root";
			String PASSWORD="";
			Class.forName(DRIVER);
			java.sql.Connection con=DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			java.sql.PreparedStatement ps= con.prepareStatement("select * from login where Email=? and Password=?");  
			ps.setString(1, bean.getEmail()); 
			ps.setString(2, bean.getPassword());  
			ResultSet rs=ps.executeQuery();  
			while (rs.next())
			{
				status=true;
				System.out.println(rs.getString("Ime")+" , "+rs.getString("Prezime")+" , "+rs.getString("Telefon")+" , "+rs.getString("Grad")+ " ,  Status:"+status);
			}
			
//			Statement stmt=con.createStatement();
//			ResultSet rs=stmt.executeQuery("select * from login where password='1548524'");
//			  //status=rs.next();
//			  while (rs.next())
//			  {
//			   status=true;
//			   System.out.println(rs.getString("Ime")+" , "+rs.getString("Prezime")+" , "+rs.getString("Telefon")+" Status:"+status);
//			  }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}
	
	public static boolean addWedding(glavna bean) throws SQLException{
		boolean status = false;
		try {
		String DRIVER="com.mysql.jdbc.Driver";
		String CONNECTION_URL="jdbc:mysql://localhost:3306/wedding";
		String USERNAME="root";
		String PASSWORD="";
		Class.forName(DRIVER);
		java.sql.Connection con=DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
		java.sql.PreparedStatement ps= con.prepareStatement("insert into glavna (GTID,LID,FSID,ROID,PID) values (?,?,?,?,?)");  
		ps.setInt(1, bean.getGTID()); 
		ps.setInt(2, bean.getLID());
		ps.setInt(3, bean.getFSID()); 
		ps.setInt(4, bean.getROID()); 
		ps.setInt(5, bean.getPID());
		System.out.println("PID:"+bean.getPID()+"GTID: "  +bean.getGTID());
//		ResultSet rs=ps.executeQuery();  
		ps.executeUpdate();
			status=true;
			System.out.println(bean.getGTID()+" , "+bean.getLID()+" , "+bean.getFSID()+" , "+bean.getROID()+ " ,  Status:"+status);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}

