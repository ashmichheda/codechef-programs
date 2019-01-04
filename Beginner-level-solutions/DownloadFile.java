//package com.prog.CodeChefBeginner;

import java.io.IOException;
import java.util.Scanner;
 
/*public*/ class DownloadFile {
 
	static long totalPrice = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		long t;
		t = sc.nextLong();
		while(t-- > 0)
		{
			totalPrice = 0;
			long n = sc.nextLong();
			long k = sc.nextLong();
			
			for(int i = 0; i<n; i++)
			{
				long time = sc.nextLong();
				long data = sc.nextLong();
				
				if(k - time >= 0)
					k = k - time;
				
				else if(k - time < 0 && k!= 0)
				{
					getTotalCost(Math.abs(k-time), data);
					k = 0;
				}
				else if(k == 0)
					getTotalCost(time,data);
			}
			System.out.println(totalPrice);
		}
		sc.close();
 
	}
	private static void getTotalCost(long abs, long data) {
		totalPrice = totalPrice + (abs * data);
		
	}
 
}