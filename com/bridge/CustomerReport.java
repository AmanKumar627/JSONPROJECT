package com.bridge;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CustomerReport {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("CustomerName", "ramana");
		obj.put("phoneNO", new String("7978720982"));
		obj.put("customerID", new Integer(787894));

		JSONObject obj1 = new JSONObject();
		obj1.put("customerNamee", "sownder");
		obj1.put("phoneNo", new String("7879086754"));
		obj1.put("customerID", new Integer(65898));

		JSONObject obj2 = new JSONObject();
		obj2.put("customerName", "sourav");
		obj2.put("phoneNo", new String("6790767689"));
		obj2.put("customerID", new Integer(987870));

		JSONArray array = new JSONArray();
		array.add(obj);
		array.add(obj1);
		array.add(obj2);

		try (FileWriter file = new FileWriter("/home/bridgelabz/customerInfo.json")) {
			file.write(array.toJSONString());
			file.flush();

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
