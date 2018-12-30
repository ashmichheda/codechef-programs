package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class AlokNathSanskar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int sum = 0;
			// taking input
			for(int i = 0; i< n; i++)
			{
				a[i] = sc.nextInt();
				sum = sum + a[i];
			}
			
			if(sum % k == 0)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}
		sc.close();

	}

}
