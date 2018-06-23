package com.store.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.strore.model.StoreModel;

public class StoreDAO {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/sruthi";
	
	
	static final String USER = "root";
	static final String PASS = "";
	
	public int storetoDB(StoreModel sm)
	{
	
	Connection conn=null;
	Statement stmt=null;
	int execute=0;
	
	try
	{
		
		Class.forName(JDBC_DRIVER);
		
		conn=DriverManager.getConnection(DB_URL, USER, PASS);
		
		stmt=conn.createStatement();
		
		String query = "INSERT INTO admindetails (EmpId, EmpName, DeptCode, DateofJoining,UserPassword) "
				+ "values('"+sm.getEmployeeid()+"','"+sm.getEmployeename()+"','"+sm.getDeptcode()+"','"+sm.getDateofjoin()+"','"+sm.getPassword()+"')";
		
		execute=stmt.executeUpdate(query);
		System.out.println("Query executed successfully" + execute);
	}
				
	catch(Exception e){
		e.getMessage();
	}
	finally
	{
		try {
			if(stmt != null)
				stmt.close();
		}
		catch (Exception e2) {
	}
		try {
			if(conn != null)
				conn.close();
		}
		catch(Exception e2) {
			
		}
	return execute;
	 
	
	 }
	}
	
}

	
		

