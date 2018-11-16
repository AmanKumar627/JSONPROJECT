 package com.bridge;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Report {
	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("stockname", "pepsi");
		obj.put("NoOfShare", new Integer(200));
		obj.put("PriceOfEachShare", new Integer(20));
		obj.put("totalamount",new Integer(4000));
		// JSONObject obj2 = new JSONObject();
		// obj2.put("firstStock", obj);

		JSONObject obj3 = new JSONObject();
		obj3.put("stockname", "Coc");
		obj3.put("NoOfShare", new Integer(150));
		obj3.put("PriceOfEachShare", new Integer(10));
		obj3.put("totalamount",new Integer(1500));
		// JSONObject obj4 = new JSONObject();
		// obj2.put("secondStock", obj3);

		JSONObject obj5 = new JSONObject();
		obj5.put("stockname", "sprite");
		obj5.put("NoOfShare", new Integer(150));
		obj5.put("PriceOfEachShare", new Integer(10));
		obj5.put("totalamount",new Integer(1500));
		// JSONObject obj6 = new JSONObject();
		// obj2.put("thirdStock", obj5);

		JSONArray stocklist = new JSONArray();
		stocklist.add(obj);
		stocklist.add(obj3);
		stocklist.add(obj5);
       System.out.println(stocklist);
		try (FileWriter file = new FileWriter("/home/bridgelabz/aman.json")) {
			file.write(stocklist.toJSONString());
			file.flush();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
