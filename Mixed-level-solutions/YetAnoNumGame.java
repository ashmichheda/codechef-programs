package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class YetAnoNumGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
		/*	int count = 0;
		
				
				for(int i = 1; i<=n; i++)
				{
				if(i == n)
				{
					count++;
					break;
				}
				
				if(n % i == 0)
				{
					n = n-i;
					count++;
				}
				
			}*/
			
			/*if(n % 2 == 0)
				System.out.println("BOB");
			else
				System.out.println("ALICE");*/
			
			if(n % 4 != 1)
				System.out.println("BOB");
			else
				System.out.println("ALICE");
		}
		sc.close();
	}

}
