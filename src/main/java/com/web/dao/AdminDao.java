package com.web.dao;

import com.web.pojo.Admin;


public interface AdminDao 
{
	 boolean checkUserCredential(Admin a);
		boolean addNewUser(Admin a);
}
