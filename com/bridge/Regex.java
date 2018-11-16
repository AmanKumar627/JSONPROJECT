package com.bridge;

import java.sql.Date;

public class Regex {
	
	
	public static void main(String args[])
	{
		Utility u=new Utility();

		UserDetails user=new UserDetails();
		System.out.println();
	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setFirstName(u.inputString());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setLastName(u.inputString());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setMobileNo(u.inputString());
		System.out.println();	
		

		System.out.println("Enter Date");
		user.setDate(u.inputString());
			
		
		//Setting current date
		user.setDate(u.getFormatedDate(user.getDate()));
		System.out.println(u.convertString(user,u.getFileText()));	
	}
}


