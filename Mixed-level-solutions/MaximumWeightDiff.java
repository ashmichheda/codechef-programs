package com.prog.CodeChefPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumWeightDiff {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- > 0)
		{
			int n,k, countChef = 0, countKid = 0;
			n = sc.nextInt();
			k = sc.nextInt();
			int rem = n-k;
			int a[] = new int[n];
			
			// taking input
			for(int m = 0; m<n; m++)
				a[m] = sc.nextInt();
			Arrays.sort(a);
			
			if(k < rem)
			{
				// 	no. of elements for kid
				for(int i = 0; i<k; i++)
					countKid += a[i];
			
				// 	no. of elements for chef
				for(int j = k; j<n; j++)
					countChef += a[j];
			}
			else
			{
				for(int i = 0; i<rem; i++)
				{
					countChef += a[i];
				}
				
				for(int j = rem; j<n; j++)
					countKid += a[j];
			}
			
			System.out.println(Math.abs(countChef - countKid));
			
		}
		sc.close();

	}

}
