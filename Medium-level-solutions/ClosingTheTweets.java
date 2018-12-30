package com.prog.CodeChefMedium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ClosingTheTweets {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		HashSet<Integer> tweetCounts = new HashSet<Integer>();
		int count = 0;
		while(k-- > 0)
		{
			input = br.readLine().split(" ");
			if(input[0].equals("CLOSEALL"))
			{
				tweetCounts.clear();
				count = 0;
			}
			else
			{
				int num = Integer.parseInt(input[1]);
				if(tweetCounts.contains(num))
				{
					tweetCounts.remove(num);
					count--;
				}
				else
				{
					tweetCounts.add(num);
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
