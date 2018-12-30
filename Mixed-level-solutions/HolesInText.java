package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class HolesInText {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			String input = sc.next();
			input = input.toUpperCase();
			char c[] = input.toCharArray();
			int len = c.length;
			int holeCount = 0;
			// logic for finding holes in text
			
			for(int i = 0; i<len; i++)
			{
				if(c[i] == 'A' || c[i] == 'D' || c[i] == 'O' || c[i] == 'P' || c[i] == 'R' || c[i] == 'Q')
					holeCount++;
				
				else if(c[i] == 'B')
					holeCount = holeCount + 2;
				
				else if(c[i] == 'C' || c[i] == 'E' || c[i] == 'F' || c[i] == 'K')
					continue;
			}
			
			System.out.println(holeCount);
		}
		sc.close();
	}

}
