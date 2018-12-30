package com.prog.CodeChefMedium;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong())
		{
			long n = sc.nextLong();
			System.out.println(getMaxDollars(n));
		}
		sc.close();
	}

	private static long getMaxDollars(long n) {
		
		if(n < 12)
			return n;
		else
			return getMaxDollars(n/2) + getMaxDollars(n/3) + getMaxDollars(n/4);
	}

}
