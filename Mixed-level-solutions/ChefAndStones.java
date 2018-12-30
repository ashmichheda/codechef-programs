package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndStones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			long max = 0, profitMax = 0;
			String input[] = br.readLine().split(" "); 
			int n = Integer.parseInt(input[0]);
			long k = Integer.parseInt(input[1]);
			
			
			String aPart[] = br.readLine().split(" ");
			String bPart[] = br.readLine().split(" ");
			long a[] = new long[n];
			long profit[] = new long[n];
			// taking input
			for(int i = 0; i<n; i++)
			{
				a[i] = Long.parseLong(aPart[i]);
				profit[i] = Long.parseLong(bPart[i]);
				
				if(i == 0)
				{
					max = k/a[i];
					profitMax = max*profit[i];
				}
			
				else
				{
					max = k/a[i];
					profitMax = Math.max(max*profit[i], profitMax);
				}
				
			}
			System.out.println(profitMax);
		}
			
		}
		
	}

