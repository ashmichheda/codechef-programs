package com.prog.CodeChefEasy;

import java.util.Scanner;

public class ChefAndKingShip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int min[] = new int[n];
			int minIndex = 0;
			for(int i = 0; i<n; i++)
			{
				min[i] = sc.nextInt();
				if(min[i] < min[minIndex])
					minIndex = i;
			}
			long sum = 0;
			for(int i = 0; i<n; i++)
			{
				if(i == minIndex)
					continue;
				else
					sum = sum + (long) min[i]*min[minIndex];
			}
			System.out.println(sum);
		}
		sc.close();

	}

}
