package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class SumQueries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		while(k > 0)
		{
			long ans = 0;
			long q = sc.nextLong();
			if(q < n+2)
				System.out.println("0");
			else
			{
				ans = n - Math.abs(q-(2*n+1));
				System.out.println(ans);
			}
			
			k--;
		}
		sc.close();
		
		
		
	}

}
