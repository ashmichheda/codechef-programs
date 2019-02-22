//package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*public*/ class ChefAndEid {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long a[] = new long[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			// taking input
			for(int i = 0; i<n; i++)
				a[i] = Long.parseLong(st.nextToken());
			
			Arrays.sort(a);
			long minAbsValue = Math.abs(a[0] - a[1]);
			for(int i = 2; i< a.length; i++)
			{
				minAbsValue = Math.min(minAbsValue, Math.abs(a[i] - a[i-1]));
			}
			System.out.println(minAbsValue);
		}

	}

}
