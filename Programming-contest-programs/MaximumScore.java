package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class MaximumScore {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String input[];
		int a[];
		while(t -- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int maximumScore[] = new int[n];
			int k = 0, count = 0, sum = 0, sumOfTotalNos = 0;
			for(int i = 0; i<n; i++)
			{
				a = new int[n];
				input = new String[n];
				input = br.readLine().split(" ");
				for(int j = 0; j<n; j++)
				{
					a[j] = Integer.parseInt(input[j]);
					sumOfTotalNos = sumOfTotalNos + a[j];
				}
					
				maximumScore[k++] = findMaximumNumber(a);
				//System.out.println("Max score each time: "+maximumScore[i]);
			}
				for(int i = 0; i<n; i++)
				{
					sum = sum + maximumScore[i];
					if(maximumScore[i] == -1)
					{
						count++;
					}
						
				}
				if(count > 0)
					System.out.println("-1");
				else
					System.out.println(sum - count*(-1));	
		}
		
	}

	private static int findMaximumNumber(int[] a) {
		int length = a.length;
		int max = 0;
		boolean maxValueFlag = false;
		HashSet<Integer> countIdenticalNos = new HashSet<Integer>();
		for(int j = 0; j<length; j++)
		{
			for(int i = j+1; i<length; i++)
			{
				if(a[j] == a[i])
					countIdenticalNos.add(a[i]);
			}
		}
		
		
		for(int i = 1; i<length; i++)
		{
			if(a[i] > a[i-1] && !countIdenticalNos.contains(a[i]))
			{
				max = a[i];
				maxValueFlag = true;
			}
		}
		if(maxValueFlag)
			return max;
		else		
			return -1;
	}

}
