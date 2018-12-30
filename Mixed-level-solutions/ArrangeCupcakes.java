package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class ArrangeCupcakes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t;
		long quo, diff;
		t = sc.nextInt();
		while(t-- > 0)
		{
			long n = sc.nextLong();
			diff = 99999999;
			for(int i = 1; i<=Math.sqrt(n); i++)
			{
				if(n%i == 0)
				{
					quo = n/i;
					if(Math.abs(quo-i)  < diff)
						diff = Math.abs(quo-i);
					
				}
			}
			System.out.println(diff);
		}
		
		
		sc.close();

	}

}
