package com.store.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.service.StoreBusinessLogin;
import com.strore.model.StoreLoginModel;

/**
 * Servlet implementation class StoreLoginServlet
 */
//@WebServlet("/StoreLoginServlet")
public class StoreLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreLoginServlet() {
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
		
		String userid=request.getParameter("user_id");
		String password=request.getParameter("password");
						
		StoreLoginModel slm = new StoreLoginModel();
		slm.setUser(userid);
		slm.setPassword(password);
		
		System.out.println("User and Login password entered successfully");
		
		StoreBusinessLogin loginsbl = new StoreBusinessLogin();
		boolean strlogin = loginsbl.storeloginbusiness(slm);
		
		if(strlogin)
		{
			request.getRequestDispatcher("ProductList.jsp").forward(request, response);
		}
		
		else
		{
			response.sendRedirect("StoreLogin.jsp");
		}
		
	}

}
