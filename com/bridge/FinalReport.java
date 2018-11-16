package com.bridge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FinalReport {
	public static void main(String[] args) throws ParseException {

		JSONObject stock;
		Scanner sc = new Scanner(System.in);

		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader("/home/bridgelabz/aman1.json");
			Object obj = parser.parse(reader);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject obj1 = (JSONObject) array.get(i);

				System.out.println("stockname" + obj1.get("stockname") + "\n no of Share " + obj1.get("noOfShare")
						+ "\n priceOfShare" + obj1.get("priceOfShare") + "\ntotalPric" + obj1.get("totalamount"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		JSONParser parser1 = new JSONParser();
		try {
			FileReader reader = new FileReader("/home/bridgelabz/customerInfo.json");
			Object obj = parser1.parse(reader);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject obj1 = (JSONObject) array.get(i);

				System.out.println("customer name" + obj1.get("CustomerName") + "\n phone no " + obj1.get("phoneNo")
						+ "\n customer id" + obj1.get("customerID"));

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

						stock = (JSONObject) array.get(number - 1);

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
						// S
						newstock = stocknum - noofstock;
						stock.put("number of stock", newstock);
						long amount = (long) stock.get("totalamount");
						long price = (long) stock.get("PriceOfEachShare");
						totalstockamount = noofstock * price;
						newamount = amount - totalstockamount;
						stock.put("total amount", newamount);
						break;

					case 2:

						long nofstock = 0;

						long newStock = 0;
						long newAmount = 0;
						long totalstockAmount = 0;

						stock = (JSONObject) array.get(number - 1);

						System.out.println("selected stock is" + stock.get("stockname"));
						// System.out.println("enter no of stock you want");
						System.out.println("enter number of stock you want");
						System.out.println("total number of stock i have" + stock.get("NoOfShare"));

						noofstock = sc.nextLong();
						long stocknum1 = (long) stock.get("NoOfShare");
						while (noofstock > stocknum1) {
							if (noofstock > stocknum1) {
								System.out.println("only i have  this much" + stock.get("NoOfShare"));
								System.out.println("enter number of stock you want");
								noofstock = sc.nextLong();
							} else {
								break;
							}
						}
						newstock = stocknum1 - noofstock;
						stock.put("number of stock", newstock);
						long amount1 = (long) stock.get("totalamount");
						long price1 = (long) stock.get("PriceOfEachShare");
						totalstockamount = noofstock * price1;
						newamount = amount1 - totalstockamount;
						stock.put("total amount", newamount);
						break;

					case 3:

						long nofstOck = 0;

						long newStocK = 0;
						long neWamount = 0;
						long totalStockAmount = 0;

						stock = (JSONObject) array.get(number - 1);

						System.out.println("selected stock is" + stock.get("stockname"));
						// System.out.println("enter no of stock you want");
						System.out.println("enter number of stock you want");
						nofstOck = sc.nextLong();
						System.out.println("total number of stock i have" + stock.get("NoOfShare"));
						long stocknum2 = (long) stock.get("NoOfShare");
						while (nofstOck > stocknum2) {
							if (nofstOck > stocknum2) {
								System.out.println("only i have  this much" + stock.get("NoOfShare"));
								System.out.println("enter number of stock you want");
								nofstOck = sc.nextLong();
							} else {
								break;
							}
						}
						newStocK = stocknum2 - nofstOck;
						stock.put("number of stock", newStocK);
						long amount2 = (long) stock.get("totalamount");
						long price2 = (long) stock.get("PriceOfEachShare");
						totalstockamount = nofstOck * price2;
						neWamount = amount2 - totalstockamount;
						stock.put("total amount", neWamount);
						break;
					}
					System.out.println("yes or no");
					st = sc.next();
					if (st.equalsIgnoreCase("yes")) {
						// System.out.println("you dont want any stock to buy");
					}

					else {
						bn = true;
						// break;
					}

				}

			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
