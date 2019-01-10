//package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*public*/ class ChefAndInteractiveContest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int r = Integer.parseInt(input[1]);
		int rating;
		while(n != 0) {
			rating = Integer.parseInt(br.readLine());
			if(rating >= r)
				System.out.println("Good boi");
			else
				System.out.println("Bad boi");
			n--;
		}
		

	}

}
