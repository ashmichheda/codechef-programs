package com.prog.CodeChefPrograms;

import java.io.IOException;
import java.util.Scanner;

public class SplittingCandies {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			long n = sc.nextLong();
			long k = sc.nextLong();
			long remainder = 0, quotient = 0;
			
			// logic for splitting candies and 
			// finding the remaining
			
			if(k == 0f)
			{
				quotient = 0;
				remainder = n;
			}
			
			else
			{
				remainder = n % k;
				quotient = n/k;
			}
			System.out.println(quotient+" "+remainder);
			
		}
		sc.close();
	}

}
