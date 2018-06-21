package com.flight.booking.service;

import com.flight.booking.dao.AddFlightDAO;
import com.flight.booking.model.FlightModel;

public class BusinessLogic {
	
	public boolean flagtest;
	

	public boolean businessbooking (FlightModel fm)
	
	{
		
		if (fm.getAircraftname().equals("boeing"))
		{
			AddFlightDAO dao = new AddFlightDAO();
			int u = dao.storeflighttoDB(fm);
			System.out.println(u);
			
			if(u>0)
			{
				flagtest=true;
			}
			else
			{
				flagtest=false;
			}
		}
		else 
		{
			
		}
		return flagtest;
		
	}
	

}
