package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dracarys {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int count = 0;
		while(t-- > 0)
		{
			count = 0;
			int indexReplace = 0;
			char newChar = 0, oldChar; String result = "";
			char tempArr [] = null;
			String input[] = br.readLine().split(" ");
			String input1[] = br.readLine().split(" ");
			if(input1.length == 2)
			{
				count++;
				result = input1[1];
			}
			
			if(input.length == 3)
			{
				
				indexReplace = Integer.parseInt(input[1]);
				tempArr = input[2].toCharArray();
				newChar = tempArr[0];
				
			}
			oldChar = alphabets.charAt(indexReplace - 1);
			if(count == 1)
			{
				char tempArr1[] = result.toCharArray();
				for(int i = 0; i<result.length(); i++)
				{
					if(result.charAt(i) == oldChar)
					{
						tempArr1[i] = newChar;
					}
					if(result.charAt(i) == newChar)
					{
						tempArr1[i] = oldChar;
					}
						
				}
				for(int i = 0; i<tempArr1.length; i++)
					System.out.print(tempArr1[i]);
				System.out.println();
			}
			
			
		}
	}

}
