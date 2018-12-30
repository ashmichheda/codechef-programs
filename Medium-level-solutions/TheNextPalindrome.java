package com.prog.CodeChefMedium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheNextPalindrome {

	static boolean reverseNumber(String num)
	{
		int i = 0, j = num.length() - 1, count = 0;
		char compare[] = num.toCharArray();
		while(i < j)
		{
			if(compare[i] == compare[j])
				count++;
			i++;
			j--;
		}
		if(count == num.length()/2)
			return true;
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		long temp = 0;
		String k = "";
		while(t-- > 0)
		{
			boolean reverseNo = false;
			k = br.readLine();
			temp = Long.parseLong(k);
			String s = "";
			while(true)
			{
				temp++;
				reverseNo = reverseNumber(s+temp);
				if(reverseNo)
					break;
			}
			System.out.println(s+temp);
		}

	}

}
