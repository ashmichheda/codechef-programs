package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class ValidTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t;
		int a, b, c;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a> 0 && b>0 && c>0 && (a+b+c) == 180)
			{
					System.out.println("YES");
				
				
			}
			else
				System.out.println("NO");
			
			
		}
		sc.close();
	}

}
