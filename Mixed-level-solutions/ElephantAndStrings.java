package com.prog.CodeChefPrograms;

import java.io.IOException;
import java.util.Scanner;

public class ElephantAndStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int k, n;
			
		k = sc.nextInt();
		n = sc.nextInt();
		String luckyStr[] = new String[k];
			
		// taking k lucky string input
		for(int i = 0; i<k; i++)
		{
			luckyStr[i] = sc.next();
			//System.out.println(luckyStr[i]);
		}
		
		// taking input for n strings
		for(int i =0; i < n; i++)
		{
			String input = sc.next();
			boolean val= false;
			if(input.length() >= 47)
				val = true;
			
			for(int j = 0; j < k; j++)
			{
				if(input.contains(luckyStr[j]))
				{
					val = true;
					break;
				}
			}
			if(val)
				System.out.println("Good");
			else
				System.out.println("Bad");
		}
		
		sc.close();
	}

}
