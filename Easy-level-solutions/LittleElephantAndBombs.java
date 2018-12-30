package com.prog.CodeChefEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class LittleElephantAndBombs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			boolean destroy[] = new boolean[n];
			// check for 1st element if 1
			if(s.length() == 1 && s.charAt(0) == '1')
				destroy[0] = true;
			else
			{
				if(s.charAt(0) == '1')
				{
					destroy[0] = true;
					destroy[1] = true;
				}
				if(s.charAt(n-1) == '1')
				{
					destroy[n-1] = true;
					destroy[n-2] = true;
				}
				for(int i = 1; i<n-1; i++)
				{
					if(s.charAt(i) == '1')
					{
						destroy[i-1] = true;
						destroy[i] = true;
						destroy[i+1] = true;
					}
				}
			}
			int count = 0;
			for(int i = 0; i<n; i++)
			{
				if(!destroy[i])
					count++;
			}
			System.out.println(count);
		}

	}

}
