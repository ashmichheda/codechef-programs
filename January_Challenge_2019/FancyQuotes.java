//package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*public*/ class FancyQuotes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		
		t = Integer.parseInt(br.readLine());
	 
		while(t-- > 0) {
			
			// take input
			boolean flag = false;
			String input[] = br.readLine().split(" ");
			
			for(int i = 0; i<input.length; i++) {
				if(input[i].equals("not")) {
					flag = true;
					break;
				}
			}
				
			// check for fancy quote
			if(flag) {
				System.out.println("Real Fancy");
			}
			else
				System.out.println("regularly fancy");
		}
	}
}
