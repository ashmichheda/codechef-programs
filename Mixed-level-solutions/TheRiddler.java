package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheRiddler {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int m = Integer.parseInt(input[2]);
			int count = 0;
			if(a % m == 0)
				count = b/m - a/m + 1;
			else
				count = b/m - a/m;
			
			System.out.println(count);
		}

	}

}
