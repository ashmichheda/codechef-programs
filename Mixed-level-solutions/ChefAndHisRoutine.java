package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndHisRoutine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		outer: while(t-- > 0)
		{
			String input = br.readLine();
			int n = input.length();
			//char find[] = input.toCharArray();
			int countRightSequence = 0;
			// logic for checking sequence of activities in log
			if(input.charAt(0) == 'C')
			{
				int i = 1;
				String temp = null;
				while(i < n)
				{
					temp = input.substring(i, i+1);
					if(input.substring(i-1, i).compareTo(temp) < 0 || input.substring(i-1, i).compareTo(temp) == 0)
					{
						countRightSequence++;
						i++;
					}
					else
					{
						System.out.println("no");
						//System.exit(0);
						continue outer;
					}
				}
				if(countRightSequence == n-1)
					System.out.println("yes");
			}
			else if(input.charAt(0) == 'E')
			{
				int i = 1;
				String temp = null;
				while(i < n)
				{
					temp = input.substring(i, i+1);
					if(input.substring(i-1, i).compareTo(temp) < 0 || input.substring(i-1, i).compareTo(temp) == 0)
					{
						countRightSequence++;
						i++;
					}
					else
					{
						System.out.println("no");
						//System.exit(0);
						continue outer;
					}
				}
				if(countRightSequence == n-1)
					System.out.println("yes");
			}
			
			else if(input.charAt(0) == 'S')
			{
				int i = 1;
				String temp = null;
				while(i < n)
				{
					temp = input.substring(i, i+1);
					if(input.substring(i-1, i).compareTo(temp) == 0)
					{
						countRightSequence++;
						i++;
					}
					else
					{
						System.out.println("no");
						//System.exit(0);
						continue outer;
					}
				}
				
				if(countRightSequence == n-1)
					System.out.println("yes");
			}
		}

	}

}
