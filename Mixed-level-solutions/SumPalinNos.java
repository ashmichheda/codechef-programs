package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SumPalinNos {

	static int reverseNumber(int num)
	{
		int temp = num, d = 0, sum = 0;
		while(temp > 0)
		{
			d = temp%10;
			sum = sum*10 + d;
			temp = temp/10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int l, r, result = 0;
			String input[] = br.readLine().split(" ");
			l = Integer.parseInt(input[0]);
			r = Integer.parseInt(input[1]);
			List<Integer> list = new ArrayList<>();
			for(int i = l; i <= r; i++)
			{
				String rev = Integer.toString(i);
				String res = Integer.toString(reverseNumber(i));
				if(rev.equals(res))
					list.add(Integer.parseInt(rev));
		
					
			}
			for(int i = 0; i <list.size(); i++)
			{
				result = result + list.get(i);
			}
			System.out.println(result);
		}

	}

}
