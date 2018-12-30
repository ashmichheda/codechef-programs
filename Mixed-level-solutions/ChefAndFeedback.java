package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class ChefAndFeedback {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String binaryCheck = null;
		while(t-- > 0)
		{
			binaryCheck = sc.next();
			
			// logic to check whether feedback
			// is good or bad
			
			if(binaryCheck.contains("010") || binaryCheck.contains("101"))
				System.out.println("Good");
			else
				System.out.println("Bad");
		}

		sc.close();
	}

}
