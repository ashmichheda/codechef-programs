package com.prog.CodeChefEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChefAndEmploymentTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t, median;
		int a[];
		t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			a = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i<n; i++)
				a[i] = Integer.parseInt(st.nextToken());
			Arrays.sort(a);
			median = (n+k)/2;
			System.out.println(a[median]);
		}

	}

}
