package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HarryMagicNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String input1[] = br.readLine().split(" ");
			int n = Integer.parseInt(input1[0]);
			int s =Integer.parseInt(input1[1]);
			int input[] = new int[n];
			int sum = 0, temp = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			// taking input
			for(int i = 0; i<n; i++)
				input[i] = Integer.parseInt(st.nextToken());
			
			
			
			Arrays.sort(input);
			
			int k = -1;
			int num = 0, backUpSum = 0;
			// finding the number which can divide s
			for(int i = 0; i<n; i++)
			{
				temp = input[i];
				sum = sum + temp;
				backUpSum = sum;
				num = (n - 1) - i;
				if(num != 0)
					sum = sum + temp*num;
				
				
				if(sum == s)
				{
					if(temp > k)
					{
						k = temp;
						sum = backUpSum;
					}
				}
				else
					sum = backUpSum;
				
			}
			
			System.out.println(k);
			
		}
		

	}

}
