package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class TanuAndHeadBob {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t, n;
		t = sc.nextInt();
		while(t-- > 0)
		{
			int found = 0;
			String result = null;
			n = sc.nextInt();
			
			String test = sc.next();
			char c[] = test.toCharArray();
			
			for(int i = 0; i<n; i++)
			{
				if(c[i]!= 'N')
				{
					if(c[i] == 'Y')
						result = "NOT INDIAN";
					
					else if(c[i] == 'I')
						result = "INDIAN";
					found = 1;
				}
			}
			
			if(found == 0)
				result = "NOT SURE";
			System.out.println(result);
		}
		sc.close();
	}

}
