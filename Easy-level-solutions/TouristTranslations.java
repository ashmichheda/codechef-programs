package com.prog.CodeChefEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TouristTranslations {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int t = Integer.parseInt(input[0]);
		String m = input[1];
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		while(t-- > 0)
		{
			String temp = br.readLine();
			String finalEnglishStr = "";
			char getCharNew;
			for(int i  = 0; i<temp.length(); i++)
			{
				char getChar = temp.charAt(i);
				if(getChar == '!')
					finalEnglishStr = finalEnglishStr.concat("!");
				else if(getChar == '_')
					finalEnglishStr = finalEnglishStr.concat(" ");
				else
				{
					if(Character.isLetter(getChar))
					{
						//String inp = ""+getChar;
						getCharNew = Character.toLowerCase(getChar);
						int index = alphabets.indexOf(getCharNew);
						if(Character.isLowerCase(getChar))
							finalEnglishStr = finalEnglishStr.concat(""+m.charAt(index));
						else
							finalEnglishStr = finalEnglishStr.concat((""+m.charAt(index)).toUpperCase());
					}
					else
						finalEnglishStr = finalEnglishStr.concat(""+getChar);
					
				}
			}
			System.out.println(finalEnglishStr);
		}

	}

}
