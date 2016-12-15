package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect implements AutoCloseable{
	
	 protected Connection connection;
	 
	 public DBConnect() throws SQLException{
		 
	  try{
	  //	  DataSource dataSource= (DataSource) context.lookup("java:/comp/env/jdbc/Wedding day");
	    String DRIVER="com.mysql.jdbc.Driver";
		String CONNECTION_URL="jdbc:mysql://localhost:3306/wedding";
		String USERNAME="root";
		String PASSWORD="";
		Class.forName(DRIVER);
		connection=DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
//	  connection = dataSource.getConnection();
	  }
	  catch(Exception e){
	   e.printStackTrace();
	  }
	  
	 }
	 
	 public Connection getConnection(){
		 return connection;
	 }
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
