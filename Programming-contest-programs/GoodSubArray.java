package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class GoodSubArray {

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
			int length = a.length;
			int i  = 0, temp = 0;
			List<Integer> goodSubArrayList = new ArrayList<Integer>();
			// finding sub array
			for(i = 0; i<length-1; i++)
			{
				temp = i+1;
				while(temp < length)
				{
					if(a[i] >= a[temp])
						goodSubArrayList.add(Math.abs(i-temp)+1);
					temp++;
				}
				
			}
			Collections.sort(goodSubArrayList,Collections.reverseOrder());
			if(goodSubArrayList.size() == 0)
				System.out.println("0");
			else
				System.out.println(goodSubArrayList.get(0));
		}

	}

}
