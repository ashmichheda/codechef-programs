package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABalancedContest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int countCakeWalk = 0, countHard = 0;
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int p = Integer.parseInt(input[1]);
			int partcipants[] = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<n; i++)
				partcipants[i] = Integer.parseInt(st.nextToken());
			int cakeWalkNo = p/2;
			int hardNo = p/10;
			
			// logic for getting the count of cakewalk and hard problems
			for(int i = 0; i<n; i++)
			{
				if(partcipants[i] >= cakeWalkNo)
					countCakeWalk++;
				else if(partcipants[i] <= hardNo)
					countHard++;
			}
			if(countCakeWalk == 1 && countHard == 2)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

}
