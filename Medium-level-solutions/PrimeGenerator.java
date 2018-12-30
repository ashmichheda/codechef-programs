package com.prog.CodeChefMedium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeGenerator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			for(int i = m; i <=n; i++)
			{
				if(isPrime(i))
					System.out.println(i);
			}
			System.out.println();
		}

	}

	private static boolean isPrime(int i) {
		int nearSqrtNo = (int) Math.sqrt(i) + 1;
		if(i == 1) return false;
		for(int j = 2; j < nearSqrtNo; j++)
		{
			if(i % j == 0)
				return false;
		}
		
		return true;
	}

}
