package com.prog.CodeChefEasy;

import java.util.Scanner;
public class ChefAndSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0, max = 0;
		for(int i = 0; i<n; i++)
		{
			int a = sc.nextInt();
			if(a != 0)
			{
				count++;
			}
			else
			{
				if(count > max)
				{
					max = count;
				}
				count = 0;
			}
		}
		if(count > max)
			max = count;
		System.out.println(max);
		sc.close();
	}

}
