package com.bridge;

import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Customer {
	Scanner sc = new Scanner(System.in);
	private String customerName;
	private String phoneNO;
	private int customerID;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;

	}

	public void customerInfo() {

		String st = "";
		do {
			System.out.println("enter your name");
			setCustomerName(sc.next());

			System.out.println("enter customer phoneNo");
			setPhoneNO(sc.next());

			System.out.println("enter customer id");
			setCustomerID(sc.nextInt());
			System.out.println("do you want any more customer ");
			st = sc.next();

			System.out.println("");

			JSONObject obj = new JSONObject();
			obj.put("username", getCustomerName());
			obj.put("pnoneno", getPhoneNO());
			obj.put("customerid", getCustomerID());

			JSONArray array = new JSONArray();
			array.add(obj);

			try (FileWriter file = new FileWriter("/home/bridgelabz/customeReport.json")) {
				file.write(array.toJSONString());
				file.flush();

			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (st.equals("yes"));

	}
}
