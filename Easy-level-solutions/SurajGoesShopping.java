package com.prog.CodeChefEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SurajGoesShopping {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int amount[] = new int[n];
			String input[] = br.readLine().split(" ");
			for(int i = 0; i<n; i++)
				amount[i] =  Integer.parseInt(input[i]);
			
			Arrays.sort(amount);
			
			// main logic for finding minimum costs
			int sum = 0;
			for(int i = n-1; i>=0; i = i - 4)
			{
				sum = sum + amount[i];
				if(i != 0)
					sum = sum + amount[i-1];
			}
			
			System.out.println(sum);
		}
	}
}
