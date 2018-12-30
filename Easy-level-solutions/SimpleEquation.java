package com.prog.CodeChefEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleEquation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int a = Integer.parseInt(input[1]);
			int b = Integer.parseInt(input[2]);
			int c = Integer.parseInt(input[3]);
			long result = 0;
			for(int i = 0; i<=a; i++)
			{
				for(int j = 0; j<=b; j++)
				{
					if(n-i-j < 0)
						break;
					else
						result += Math.min(n-i-j+1,	c+1);
				}
			}
			System.out.println(result);
		}
	}

}
