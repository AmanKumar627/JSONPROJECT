package com.bridge;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
	public static void main(String[] args) {
		String Suits[] = { "club", "diamomd", "heart", "spade" };
		String Ranks[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "king", "queen", "ace" };

		int total = Suits.length * Ranks.length;
		int l = 0;
		String deck[] = new String[total];
		for (int i = 0; i < Suits.length; i++) {
			for (int j = 0; j < Ranks.length; j++) {
				deck[l] = Suits[i] + "of" + Ranks[j];
				l++;
			}
		}
		for (int i = 0; i < total - 1; i++) {
		//	System.out.println(deck[i]);
		}
		// shuffle
		for (int i = 0; i < total; i++) {// System.out.println("f");
			int random = i + (int) (Math.random() * (total - i));
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}
		// for(int i=0;i<total-1;i++)
		// {
		// System.out.println(deck[i]);
		// }

		int m = 0;
		String distribute[][] = new String[9][4];
		System.out.println("aman         ramana          sowndar        aakash");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				distribute[i][j] = deck[m];
				m++;

				System.out.print(distribute[i][j]+" ");
			}System.out.println();
		}

	}
}
