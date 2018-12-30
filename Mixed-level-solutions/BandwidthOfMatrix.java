package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class BandwidthOfMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			int count = 0, countZeros = 0;
			n = sc.nextInt();
			if(n>= 1 && n<=500)
			{
			int a[][] = new int[n][n];
			
			// taking 2D array input
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			
			// checking for diagonal matrix
			
			
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(a[i][j] == 0)
						countZeros++;
					else
					{
					if(i == j)
						continue;
					else
					{
						if(a[i][j] == 0)
							count++;
					}
					}
				}
			}
			
			if(countZeros == (n*n))
				System.out.println("0");
			
			if(count == ((n*n)-n))
				System.out.println("0");
			}
			
		}

		sc.close();
	}

}
