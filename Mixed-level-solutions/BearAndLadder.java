package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class BearAndLadder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int q,a,b;
		q = sc.nextInt();
		
		while(q-- > 0)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			int num = 1+2;
			int sum = a+b;
			int diff = a-b;
			if(a < b)
			{
				
				if(diff == -1 && (Math.abs(sum - num) % 4 == 0))
					System.out.println("YES");
			/*	else
					System.out.println("NO");
				*/
				else if((a+2) == b)
					System.out.println("YES");
				
				else
					System.out.println("NO");
			}
			
			else
			{
				if(diff == 1 && (Math.abs(sum - num) % 4 == 0))
					System.out.println("YES");
				/*else
					System.out.println("NO");*/
				else if((b+2) == a)
					System.out.println("YES");
				
				else
					System.out.println("NO");
			}
		}
		sc.close();

	}

}
