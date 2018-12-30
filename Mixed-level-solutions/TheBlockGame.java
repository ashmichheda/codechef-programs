package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class TheBlockGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			n = sc.nextInt();
			int palin = n;
			int rev = 0, d = 0;
			while(n > 0)
			{
				d = n%10;
				rev = rev*10 + d;
				n = n/10;
			}
			
			if( palin == rev)
				System.out.println("wins");
			else
				System.out.println("losses");
		}
		sc.close();
	}

}
