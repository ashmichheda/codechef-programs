package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class CardsGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		int a[] = new int[n];
		int count = 0, countMax = 0, m = 0, finalCount = 0, num;
		int order[] = new int[k];
		// taking input
		
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// when all cards are facing up
		//Iterator it = a.iterator();
		for(int i = 0; i<n; i++)
		{
			if(a[i] > 0)
				count++;
		}
		
		if(count == n)
		{
			System.out.println("0");
			System.exit(0);
		}
		for(int i = 0; i<n; i++)
		{
			finalCount = 0;
			if(countMax <= k)
			{
				if((i == n-1 && a[i] < 0))
				{
					num = 0;
					order[m++] = i+1;
					num = a[i]*-1;
					a[i] = num;
					countMax++;
				}
				else if((a[i] < 0 && (a[i+1] > 0 || a[i+1] < 0)))
				{
					num = 0;
					order[m++] = i+1;
					num = a[i]*-1;
					a[i] = num;
					if(a[i+1] > 0 && (i+1) < n)
					{
						num = 0;
						num = a[i+1]*-1;
						a[i+1] = num;
					}
					else if(a[i+1] < 0 && (i+1) < n)
					{
						num = 0;
						num = a[i+1]*-1;
						a[i+1] = num;
					}
					countMax++;
					
				}
				
				for(int p = 0; p<n; p++)
				{
					
					if(a[p] > 0)
						finalCount++;
					else
						break;
				}
				
			}
			/*else
				continue;*/
			
			if(finalCount == n)
				break;
				
		}
		
		System.out.println(/*"Magical operations: "*/+countMax);
		for(int i = 0; i<m; i++)
			System.out.print(order[i]+" ");
		sc.close();
	}

}
