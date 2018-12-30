package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class Approximately {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			/*int num1 = 103993;
			int num2 = 33102;*/
			
			String repeat = "415926530119026040722614947737296840070086399613316";
			int len = repeat.length();
			int k = sc.nextInt();
			
			if(k == 0)
				System.out.println("3");
			else if (k == 1)
				System.out.println("3.1");
			else
			{
				int digit = k-1;
				System.out.print("3.1");
				while(digit > len)
				{
					System.out.print(repeat);
					digit -= len;
				}
				System.out.println(repeat.substring(0, digit));
			}	
		}
		sc.close();

	}

}
