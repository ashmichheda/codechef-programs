package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BearSegment01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			// taking input
			String sub = br.readLine();
			char input[] = sub.toCharArray();
			int n = input.length;
			int flag = 0, count = 0;
			
			if(sub.contains("0") && !sub.contains("1"))
				System.out.println("NO");
			
			
			else if(sub.contains("1") && !sub.contains("0"))
				System.out.println("YES");
			
			else
			{
			// logic for checking '1's in sequence
			for(int i = 0; i< n; i++)
			{
				if(input[i] == '1')
				{
					count++;
					if( i != 0)
					{
						if(input[i - 1] == '0' && count > 1)
							break;
					}
					flag = 1;
				}
				
				
				/*if(sub.substring(i-1, n).contains("0") && sub.substring(i-1, n).contains("1") || sub.substring(i-1, n).contains("1") )
				{*/
				else if (i < n-1)
				{
					if((i+1) == (n-1) && input[i+1] == '0')
					{
						flag = 1;
						break;
					}
				
					flag = 0;
				}
				
				
					
				/*if(i == count)
				{
					System.out.println("NO");
					System.exit(0);
				}*/
			}
			
			if(flag == 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		}

	}

}
