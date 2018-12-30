package com.prog.CodeChefCompetitionsProgs;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];	
		for(int i = 0; i<n; i++)
			a[i] = sc.nextLong();
		Arrays.sort(a);
		long max = getMaximumRevenue(a,n);
		System.out.println(max);
		sc.close();
	}

	private static long getMaximumRevenue(long[] a, int n) {
		
		long maxRevenue = a[0]*n, factor = 0, temp = 0;
		for(int i = 1; i<n; i++)
		{
			factor = n - i;
			temp = a[i]*factor;
			if(temp > maxRevenue)
				maxRevenue = temp;
		}
		
		return maxRevenue;
	}

}
