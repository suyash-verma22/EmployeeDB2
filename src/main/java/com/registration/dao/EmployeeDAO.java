package com.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.registration.model.*;
/**
 * @author Suyash verma
 *
 */
public class EmployeeDAO {
	public static int getId(Connection connection) {
		int id=0;
		try{
			PreparedStatement ps=connection.prepareStatement("SELECT MAX( id ) AS last_id FROM employee");
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				id=rs.getInt("last_id");
				id++;
			}
		}catch(Exception e){System.out.println(e);}
		return id;
	}
	public int registerEmployee(Employee emp) throws ClassNotFoundException, SQLException{
		String insert_emp_query = "INSERT INTO employee" + 
	                              " (id,first_name,last_name,username,password,address,contact)" +
				                  " VALUES (?,?,?,?,?,?,?)";
		int result = 0;
		Connection connection = DatabaseConnection.createConnection();
		PreparedStatement ps = connection.prepareStatement(insert_emp_query);
		ps.setInt(1,getId(connection));
		ps.setString(2, emp.getFirstName());
		ps.setString(3, emp.getLastName());
		ps.setString(4, emp.getUserName());
		ps.setString(5, emp.getPassword());
		ps.setString(6, emp.getAddress());
		ps.setString(7, emp.getContact());
		
		System.out.println("preparedStatement");
		//executing query
		result = ps.executeUpdate();
		return result;
	}
}
