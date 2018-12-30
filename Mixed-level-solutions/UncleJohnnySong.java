package com.prog.CodeChefPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohnnySong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			int res = 0, pos = 0;
			n = sc.nextInt();
			int a[] = new int[n+1];
			// taking input
			for(int i = 1; i<=n; i++)
			{
				a[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			pos = a[k];
			Arrays.sort(a);
			
			
			// logic for finding the song position
			if(pos == a[k])
				System.out.println(k);
			else
			{
			for(int i = 1; i<=n; i++)
			{
				if(a[i] == pos)
				{
					res = i;
					break;
				}
			}
			//int diff = Math.abs(res - (k-1));
			System.out.println(res);
			}
			
		}
		sc.close();
	}

}
