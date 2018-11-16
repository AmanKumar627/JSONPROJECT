package com.bridge;

import com.bridge.Utility;

import java.util.Scanner;

public class StockMain {


	public static void main(String args[])
	
	{
	/*Scanner scanner=new Scanner(System.in);
	System.out.println("enter the name of share");
	String name=scanner.next();
	System.out.println("enter the no of stock");
	int number=scanner.nextInt();
	System.out.println("enter the no of share");
	int number2=scanner.nextInt();
	System.out.println("enter the price of each share");
	int price=scanner.nextInt();*/
		//get stock details read stock details from fie.txt and display reports.s
	System.out.println(new Utility().getStockDetails());
	}
}
	
	


