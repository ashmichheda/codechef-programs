package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChefAndRainbowArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int inp[] = new int[n];
			String inp1 = "";
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<n; i++)
			{
				inp[i] = Integer.parseInt(st.nextToken());
				inp1 = inp1 + inp[i];
			}
			//System.out.println("inp1 "+inp1);
			boolean check = false;
			for(int i = 0; i<n-1; i++)
			{
				if(inp[i] == inp[i+1] && i+1 <= n-1)
					check = true;
			}
			if(check)
			{
				String input1[] = inp1.split("7");
				char asc[] = input1[0].toCharArray();
				char desc[] = input1[1].toCharArray();
				Arrays.sort(desc);
				// checking each char of the 2 arrays
				int count = 0;
				for(int i = 0; i<asc.length; i++)
				{
					if(asc[i] == desc[i])
						count++;
				}
				if(count == asc.length)
					System.out.println("yes");
				else
					System.out.println("no");
			}
			else
				System.out.println("no");
			
		}

	}

}
