package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndOperators {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());

		while(t-- > 0)
		{
			int a,b;
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			
			if(a < b)
				System.out.println("<");
			else if(a>b)
				System.out.println(">");
			else
				System.out.println("=");
		}
	}

}
