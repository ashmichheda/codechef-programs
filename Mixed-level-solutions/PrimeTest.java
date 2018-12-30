package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		Outer: while(t-- > 0)
		{
			int n = sc.nextInt();
			int count = 0;
			// Check for prime
			
			if(n % 2 == 0  && n!= 2)
			{
				System.out.println("no");
				continue Outer;
			}
			for(int i = 1; i<=n; i++)
			{
				if(n % i == 0)
					count++;
	
			}
			
			if(count == 2)
				System.out.println("yes");
			
			else
				System.out.println("no");
		}
		sc.close();
	}

}
