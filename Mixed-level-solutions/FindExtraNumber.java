package com.prog.CodeChefPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindExtraNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			int num = 0;
			n = sc.nextInt();
			int a[] = new int[n];
			
			// taking array input
			for(int i = 0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			
			//sort the array
			Arrays.sort(a);
			
			for(int i = n-1; i>0; i--)
			{
				if((a[i] - a[i-1]) == 1)
					continue;
				else
				{
					if(i == n-1)
						num = i;
					else
					num = i-1;
					
				}
			}
			System.out.println(a[num]);
		}

		sc.close();
	}

}
