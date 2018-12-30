package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class SmallestNoOfDenominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-->0)
		{
			int count = 0;
			n = sc.nextInt();
			
			if(n >= 100)
			{
				count += n/100;
				n = n%100;
			}
			
			if(n >= 50)
			{
				count += n/50;
				n = n%50;
			}
			
			if(n >= 10)
			{
				count += n/10;
				n = n%10;
			}
			
			if(n >= 5)
			{
				count += n/5;
				n = n%5;
			}
			
			if(n >= 2)
			{
				count += n/2;
				n = n%2;
			}
			
			if(n >= 1)
			{
				count += n/1;
				n = n%1;
			}
			
			System.out.println(count);
			
			
		}

		sc.close();
	}

}
