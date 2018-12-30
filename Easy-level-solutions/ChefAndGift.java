package com.prog.CodeChefEasy;

import java.util.Scanner;

public class ChefAndGift {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sum = 0;
			for(int i = 0; i<n; i++)
			{
				if(sc.nextInt() % 2 == 0)
					sum++;
			}
			if(k == 0 && sum == n)
				System.out.println("NO");
			else if(sum >= k)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();

	}

}
