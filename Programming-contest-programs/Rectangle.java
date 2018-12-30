package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -- > 0)
		{
			String input[] = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			int d = Integer.parseInt(input[3]);
			// logic to check for rectangle
			if(a == b)
			{
				if(c == d)
				{
					System.out.println("YES");
					continue;
				}
					
				else
				{
					System.out.println("NO");
					continue;
				}
					
			}
			
			if(a == c)
			{
				if(b == d)
				{
					System.out.println("YES");
					continue;
				}
				else
				{
					System.out.println("NO");
					continue;
				}
			}
			
			if(a == d)
			{
				if(b == c)
				{
					System.out.println("YES");
					continue;
				}
				else
				{
					System.out.println("NO");
					continue;
				}
			}
			if(a != b && a!=c && a!=d)
			{
				System.out.println("NO");
				continue;
			}
		}
	}

}
