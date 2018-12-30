package com.prog.CodeChefPrograms;

import java.io.IOException;
import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- > 0)
		{
			long a,b,n;
			a = sc.nextLong();
			b = sc.nextLong();
			n = sc.nextLong();
			if(n%2!=0)
			{
				a = a*2;		
			}
			
			if(a>b)
				System.out.println((int)(a/b));
			else
				System.out.println((int)(b/a));
				
		}
		sc.close();
	}

}
