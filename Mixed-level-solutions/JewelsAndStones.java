package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class JewelsAndStones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String j,s;
		while(t-- > 0)
		{
			j = sc.next();
			s = sc.next();
			int count = 0;
			int len1 = j.length();
			int len2 = s.length();
			for( int m = 0; m<len2; m++)
			{
				for(int n = 0; n<len1; n++)
					if(j.charAt(n) == s.charAt(m))
					{
						count++;
						break;
					}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
