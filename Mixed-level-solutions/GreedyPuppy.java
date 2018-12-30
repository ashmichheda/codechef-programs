package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class GreedyPuppy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			if( k == 1)
				System.out.println("0");
			else
			{
				int max = 0;
				for(int i = 1; i<=k; i++)
				{
				int count = (n/i) * i;
				int maxCoin = n - count;
				if(maxCoin > max)
					max = maxCoin;
				}
				System.out.println(max);
			}
		}
		sc.close();
	}

}
