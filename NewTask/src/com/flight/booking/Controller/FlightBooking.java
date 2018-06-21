package com.flight.booking.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.flight.booking.service.BusinessLogic;

import com.flight.booking.model.FlightModel;

/**
 * Servlet implementation class FlightBooking
 */
//@WebServlet("/FlightBooking")
public class FlightBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String fn = request.getParameter("flightname");
		String src = request.getParameter("source");
		String dst = request.getParameter("destination");
		String fare = request.getParameter("fare");
		double farecost = Double.parseDouble(fare);
		String nos = request.getParameter("noofseats");
		int seats = Integer.parseInt(nos);
		String ac = request.getParameter("aircraftname");
		
		FlightModel fm = new FlightModel();
		fm.setFlightname(fn);
		fm.setSource(src);
		fm.setDestination(dst);
		fm.setFare(farecost);
		fm.setNoofseats(seats);
		fm.setAircraftname(ac);
		
		
		BusinessLogic bl = new BusinessLogic();
		boolean a = bl.businessbooking(fm);
		
		if(a)
		{
			
		}
		else
		{
			response.sendRedirect("https://www.makemytrip.com/");
		}
		
	}

}
