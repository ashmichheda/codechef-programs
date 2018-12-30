package com.prog.CodeChefPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Horses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			n = sc.nextInt();
			int a[] = new int[n];
			
			// taking input
			for(int i = 0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			
			//finding minimum distance logic
			// between horse's skills
			Arrays.sort(a);
			
			int diff = a[n-1] - a[n-2];
			for(int i = n-2; i>0; i--)
			{
				if(a[i] - a[i-1] < diff)
				{
					diff = a[i] - a[i-1]; 
				}
				else
					continue;
			}
			System.out.println(diff);
		}
		sc.close();
	}

}
