package com.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;

public class Utility {

	BufferedReader br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "01/01/2016";

	// constructor to initialize bufferedReader
	public Utility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	// Regex pattern matcher match the string and replace the regex pattern with
	// user details.
	public String convertString(UserDetails userDetails, String message) {
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message);
		message = m.replaceAll(userDetails.getFirstName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.getFirstName() + " " + userDetails.getLastName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.getMobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.getDate());
		return message;
	}

	// take input word
	public String inputString() {
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return "";
	}

	public Date printDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(date);
		} catch (ParseException pe) {
			return null;
		}
	}

	// format date object in this format 01/12/2016
	public String getFormatedDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(printDate(date));
	}

	// Take file name as input and return string of file text
	public String getFileText() {
		try {
			br = new BufferedReader(new FileReader("/home/bridgelabz/aman7.txt"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				break;
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
			}
		}
	}

	public ArrayList<Stock> getStockDetails() {
		ArrayList<Stock> stockList = new ArrayList<Stock>();
		try {
			br = new BufferedReader(new FileReader("/home/bridgelabz/aman8.txt"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			SortingFunction sortingFunction = new SortingFunction();
			while (line != null) {
				String words[] = sortingFunction.wordsArrayFromStatement(line);
				try {
					stockList.add(new Stock(words[0], Integer.parseInt(words[1]), Integer.parseInt(words[2])));
				} catch (NumberFormatException nfe) {
				} catch (ArrayIndexOutOfBoundsException ae) {
				}
				line = br.readLine();
			}
			return stockList;
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
			}
		}

	}

}
