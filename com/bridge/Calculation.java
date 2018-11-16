package com.bridge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Calculation {

	public static void main(String[] args) throws ParseException, IOException {
		Scanner sc = new Scanner(System.in);

		JSONParser parser = new JSONParser();
		JSONObject stock;
		FileReader reader = new FileReader("/home/bridgelabz/aman1.json");
		Object obj = parser.parse(reader);
		JSONArray list = (JSONArray) obj;

		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			JSONObject obj1 = (JSONObject) list.get(i);
			System.out.println("stockname" + obj1.get("stockname") + "\n no of Share " + obj1.get("noOfShare")
					+ "\n priceOFShare" + obj1.get("priceOfShare") + "\ntotalPric" + obj1.get("totalamount"));

		}

		try (FileWriter file = new FileWriter("/home/bridgelabz/finalReport.json")) {
			file.write(list.toJSONString());
			file.flush();

			System.out.println("1.samsungPhone \n2.MIphone \n3.MacromaxPhone");
			int number = 0;
			String st = "yes";
			boolean bn = false;
			while (bn == false) {
				System.out.println("enter the  stock you want to  buy");
				number = sc.nextInt();
				switch (number) {

				case 1:

					long noofstock = 0;

					long newstock = 0;
					long newamount = 0;
					long totalstockamount = 0;

					stock = (JSONObject) list.get(number - 1);

					System.out.println("selected stock is" + stock.get("stockname"));
					// System.out.println("enter no of stock you want");
					System.out.println("enter number of stock you want");
					noofstock = sc.nextLong();
					System.out.println("total number of stock i have" + stock.get("noOfShare"));
					long stocknum = (long) stock.get("noOfShare");
					while (noofstock > stocknum) {
						if (noofstock > stocknum) {
							System.out.println("only i have  this much" + stock.get("noOfShare"));
							System.out.println("enter number of stock you want");
							noofstock = sc.nextLong();
						} else {
							break;
						}
					}

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
