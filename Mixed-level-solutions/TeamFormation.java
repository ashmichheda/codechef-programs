package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TeamFormation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n,m,temp = 0; //len = 0;
			String input1[] = br.readLine().split(" ");
			n = Integer.parseInt(input1[0]);
			m = Integer.parseInt(input1[1]);
			temp = m;
			List<Integer> team = new ArrayList<>();
			while(temp > 0)
			{
				String input[] = br.readLine().split(" ");
				/*if(team.size() == 0)
				{*/
					team.add(Integer.parseInt(input[0]));
					team.add(Integer.parseInt(input[1]));
				//}
				
			/*	else
				{
					len = team.size();
					for(int i = 0; i < len; )
				}*/
				
				temp--;	
			}
			n = n - 2*m;
			if(n % 2 == 0)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}

	}

}
