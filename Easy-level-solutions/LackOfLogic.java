package com.prog.CodeChefEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LackOfLogic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String s = br.readLine();
			int temp[] = new int[26];
			for(int i = 0; i < s.length(); i++)
			{
				char ch = s.charAt(i);
				if(Character.isLetter(ch))
				{
					ch = Character.toLowerCase(ch);
					temp[ch - 97]+= 1;
				}
			}
			String finalString = "";
			for(int i = 0; i<26; i++)
			{
				if(temp[i] == 0)
					finalString = finalString + (char)(i + 97);
				
			}
			if(finalString.length() == 0)
				System.out.println("~");
			else
				System.out.println(finalString);
		}

	}

}
