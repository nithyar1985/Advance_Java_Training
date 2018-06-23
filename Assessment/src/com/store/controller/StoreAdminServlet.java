package com.store.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.store.service.StoreBusinessLogin;
import com.strore.model.StoreModel;

/**
 * Servlet implementation class StoreServlet
 */
//@WebServlet("/StoreServlet")
public class StoreAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreAdminServlet() {
        super();
   
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empid=request.getParameter("empid");
		String empname=request.getParameter("empname");
		String deptcode=request.getParameter("deptcode");
		String doj=request.getParameter("doj");
		String useractive=request.getParameter("useractive");
		String password=request.getParameter("password");
		
		StoreModel sm = new StoreModel();
		sm.setEmployeeid(empid);
		sm.setEmployeename(empname);
		sm.setDeptcode(deptcode);
		sm.setDateofjoin(doj);
		sm.setPassword(password);
		
		System.out.println("Admin details entered:");
		System.out.println("//////ffff"+sm.getDeptcode());
		StoreBusinessLogin sbl = new StoreBusinessLogin();
		boolean str = sbl.storebusiness(sm);
		
		if(str)
		{
		request.getRequestDispatcher("Storelogin.jsp").forward(request, response);
		
		}
		else
		{
			response.sendRedirect("Storeadminregister.jsp");
		}
		
		
	}

}
