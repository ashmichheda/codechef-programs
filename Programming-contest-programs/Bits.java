package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bits {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			String result = Integer.toBinaryString(n);
			for(int i = 0; i<result.length(); i++)
			{
				if(result.charAt(i) == '1')
					count++;
			}
			System.out.println(count);
		}

	}

}
