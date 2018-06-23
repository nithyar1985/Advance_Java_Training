package com.store.service;

import com.store.dao.StoreDAO;
import com.strore.model.StoreLoginModel;
import com.strore.model.StoreModel;


public class StoreBusinessLogin {
	
	public boolean flag, flaglogin1;
	
	public boolean storebusiness(StoreModel sm)
	
	{
		try {
			if(sm.getDeptcode().equalsIgnoreCase("str1"))
			{
				StoreDAO strdao = new StoreDAO();
				int store = strdao.storetoDB(sm);
				System.out.println(store);
				
				if(store>0)
				{
					flag=true;
				}
				else {
					flag=false;
				}
			}
			else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
return flag;
	}
	public boolean storeloginbusiness (StoreLoginModel slm)
	{
		try {
			if(slm.getPassword().equalsIgnoreCase(""))
			{
				StoreDAO strpwd = new StoreDAO();
				
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return flaglogin1;
		
	}
	
	

			
	
	
	
}
