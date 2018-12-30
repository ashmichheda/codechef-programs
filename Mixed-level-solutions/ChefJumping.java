package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class ChefJumping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		
		if(a % 6 == 0)
			System.out.println("yes");
		else
		{
			if(a%6 == 1)
				System.out.println("yes");
			else if(a % 6 == 3)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
		
	}

}
