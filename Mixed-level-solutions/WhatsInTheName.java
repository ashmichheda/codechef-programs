package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatsInTheName {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String s = br.readLine();
			int len = s.length();
			int count = 0;
			
			// getting the count of the parts
			for(int i = 0; i<len; i++)
			{
				if(s.charAt(i) == ' ')
					count++;
			}
			
			//System.out.println("total parts of string "+count);
			
			// logic of the name w.r.t count
			if(count == 0)
			{
				String name = s.toUpperCase().substring(0, 1).concat(s.substring(1, len).toLowerCase());
				System.out.println(name);
			}
			
			else if(count == 1)
			{
				int temp = 0;
				for(int i = 0; i<len; i++)
				{
					if(s.charAt(i) == ' ')
					{
						temp = i+1;
						break;
					}
				}
				String name = s.toUpperCase().substring(0, 1).concat(".").concat(" ").concat(s.toUpperCase().substring(temp, temp+1))
						.concat(s.substring(temp+1, len).toLowerCase());
				System.out.println(name);
			}
			
			else
			{
				int temp = 0, countChar = 0;
				String name = "";
				for(int i = 0; i<len; i++)
				{
					if(s.charAt(i) == ' ')
					{
						temp = i+1;
						countChar++;
						
						if(countChar == 1)
						{
							name = s.toUpperCase().substring(0, 1).concat(".").concat(" ").concat(s.toUpperCase().substring(temp, temp+1))
									.concat(".").concat(" ");
						}
						else if(countChar == 2)
						{
							name = name.concat(s.toUpperCase().substring(temp, temp+1)).concat(s.substring(temp+1, len).toLowerCase());
							break;
						}
					}
				}
				System.out.println(name);
			}
			
		}

	}

}
