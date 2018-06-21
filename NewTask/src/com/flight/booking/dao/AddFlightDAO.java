package com.flight.booking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.flight.booking.model.FlightModel;

public class AddFlightDAO {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/nithya";
	
	//Database credentials
	static final String USER = "root";
	static final String PASS = "";
	
	public int storeflighttoDB(FlightModel fm)
	{
	
	Connection conn=null;
	Statement stmt=null;
	int execute=0;
	
	
		 //Registering the Driver
		
		try
		{
			//Registering the driver here
			Class.forName(JDBC_DRIVER);
			
			//getting the connection
			conn=DriverManager.getConnection(DB_URL, USER, PASS);
			
			//creating the statement
			stmt=conn.createStatement();
			
			//writing the query by using the statement
			
			String query="INSERT INTO flightbooking (FlightName, Source, Destination, Fare, Seat, AircraftName) "
					+ "VALUES ('"+fm.getFlightname()+"','"+fm.getSource()+"','"+fm.getDestination()+"','"
					+String.valueOf(fm.getFare())+"','"+String.valueOf(fm.getNoofseats())+"','"+fm.getAircraftname()+"')";
							
			
			
			//executing 
			execute = stmt.executeUpdate(query);
			System.out.println("Executed successfully:"+ execute);
			
		}
		
		catch(Exception e)
		{
		 e.getMessage();
		}
		
		finally
		{
			try {
				if(stmt != null)
					stmt.close();
			} catch (Exception e2) {
				//TODO: handle exception
			}
			try {
				if(conn != null)
					conn.close();
			} catch (Exception e2) {
				//TODO: handle exception
			}
		}
		return execute;
	}
	
	
}
