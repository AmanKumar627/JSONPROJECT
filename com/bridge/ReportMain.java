 package com.bridge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReportMain {
	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		JSONObject stock;
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("enter the number of stock"); int stock =
		 * sc.nextInt(); System.out.println("enter the name of stock"); String
		 * name = sc.next(); System.out.println("enter the no of share"); int
		 * share = sc.nextInt();
		 */
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader("/home/bridgelabz/aman.json");

			Object obj = parser.parse(reader);
			JSONArray list = (JSONArray) obj;

			System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				JSONObject obj1 = (JSONObject) list.get(i);
				System.out.println("stockname" + obj1.get("stockname") + "\n no of Share " + obj1.get("NoOfShare")
						+ "\n priceOFShare" + obj1.get("PriceOfEachShare") + "\ntotalPric" + obj1.get("totalamount"));
               System.out.println("yes or no");
			}
				System.out.println("1.pepsi\n2.coc\n3.sprite");
				int number;
				String st = "yes";
				boolean bn = false;
				while (bn == false)
				{
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
						System.out.println("total number of stock i have" + stock.get("NoOfShare"));
						long stocknum = (long) stock.get("NoOfShare");
						while (noofstock > stocknum) {
							if (noofstock > stocknum) {
								System.out.println("only i have  this much" + stock.get("NoOfShare"));
								System.out.println("enter number of stock you want");
								noofstock = sc.nextLong();
							} else {
								break;
							}
						}
						//System.out.println("gch");
						newstock = stocknum - noofstock;
						stock.put("NoOfShare", newstock);
						long amount = (long) stock.get("totalamount");
						long price = (long) stock.get("PriceOfEachShare");
						totalstockamount = noofstock * price;
						newamount = amount - totalstockamount;
						stock.put("totalamount", newamount);
						break;

					case 2:

						long nofstock = 0;

						long newStock = 0;
						long newAmount = 0;
						long totalstockAmount = 0;

						stock = (JSONObject) list.get(number - 1);

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

						stock = (JSONObject) list.get(number - 1);

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
				st=sc.next();
				if(st.equalsIgnoreCase("yes"))
						{
			//	System.out.println("you dont want any stock to buy");	
						}
			
				else
				{
					bn=true;
					//break;
				}
			
			}
			
	
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

// TODO Auto-generated method stub
