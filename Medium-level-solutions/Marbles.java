package com.prog.CodeChefMedium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marbles {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long n,k;
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			n = Long.parseLong(input[0]);
			k = Long.parseLong(input[1]);
			System.out.println(getPermutations(n-1, k-1));
		}

	}

	private static long getPermutations(long n, long k) {
		
		if(n == k)
			return 1;
		else if(k == 0)
			return 1;
		else if(k == 1)
			return n;
		
		long noOfMarbles = 1;
		long minVal = Math.min(k, n-k);
		for(int i = 1; i<=minVal; i++)
		{
			noOfMarbles = noOfMarbles*n;
			noOfMarbles = noOfMarbles/i;
			n--;
		}
		return noOfMarbles;
	}

}
