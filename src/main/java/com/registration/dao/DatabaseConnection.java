package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static Connection createConnection() throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/employeedb?useSSL=false";
		String username = "root";
		String password = "@Suyash0605#";
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			
		}catch(SQLException e){System.out.println(e);}
		return con;
		
	}
}
