package com.bridge;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class stockAccount {
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
				obj.put("stockname","samsungphone");
				obj.put("noOfShare", new Integer(50));
				obj.put("priceOfShare",new Integer(5000));
				obj.put("totalamount",new Integer(50*5000));
				
				
				
				JSONObject obj1=new JSONObject();
				obj1.put("stockname","MIphone");
				obj1.put("noOfShare", new Integer(60));
				obj1.put("priceOfShare", new Integer(2000));
				obj1.put("totalamount", new Integer(60*5000));
				
				
				JSONObject obj2=new JSONObject();
				obj2.put("stockname", "MacromaxPhone");
				obj2.put("noOfShare", new Integer(40));
				obj2.put("priceOfShare", new Integer(4000));
				obj2.put("totalamount", new Integer(40*4000));
				
				JSONArray array=new JSONArray();
				array.add(obj);
				array.add(obj1);
				array.add(obj2);
				
			try	(FileWriter file=new FileWriter("/home/bridgelabz/aman1.json")){
				    file.write(array.toJSONString());
				    file.flush();
			}
				    catch (IOException e) {
						e.printStackTrace();
					}
				
				
	
			}}



