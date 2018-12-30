package com.prog.CodeChefPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Lapindromes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t;
		String s = null;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			
			s = sc.next();
			int n = s.length();
			//System.out.println(n);
			if(n % 2 == 0)
			{
				String s1 = s.substring(0, n/2);
				String s2 = s.substring(n/2);
				char a[] = s1.toCharArray();
				char b[] = s2.toCharArray();
			
				Arrays.sort(a);
				Arrays.sort(b);
				if(Arrays.equals(a, b))
					System.out.println("YES");
				else
					System.out.println("NO");
					 
			}
			else
			{
				String s1 = s.substring(0, (n/2)+1);
				String s2 = s.substring(n/2);
				char a[] = s1.toCharArray();
				char b[] = s2.toCharArray();
			
				Arrays.sort(a);
				Arrays.sort(b);
				if(Arrays.equals(a, b))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
		sc.close();
	}

}
