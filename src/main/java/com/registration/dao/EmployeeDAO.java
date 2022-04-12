package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registration.model.*;
/**
 * @author Suyash verma
 *
 */
public class EmployeeDAO {
	public int registerEmployee(Employee emp) throws ClassNotFoundException{
		String insert_emp_query = "INSERT INTO employee" + 
	                              " (id,first_name,last_name,username,password,address,contact)" +
				                  " VALUES (?,?,?,?,?,?,?)";
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employeedb?useSSL=false";
		String username = "root";
		String password = "@Suyash0605#";
		try(Connection connection = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = connection.prepareStatement(insert_emp_query)){
				ps.setInt(1,3);
				ps.setString(2, emp.getFirstName());
				ps.setString(3, emp.getLastName());
				ps.setString(4, emp.getUserName());
				ps.setString(5, emp.getPassword());
				ps.setString(6, emp.getAddress());
				ps.setString(7, emp.getContact());
				
				System.out.println("preparedStatement");
				//executing query
				result = ps.executeUpdate();
	    }catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
