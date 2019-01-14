//package com.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*public*/ class Mahasena {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		String noOfWeapons[] = br.readLine().split(" ");
		int check, countEven = 0, countOdd = 0;
		// check whether ready for battle
		for(int i = 0; i < n; i++){
			check = Integer.parseInt(noOfWeapons[i]);
			
			if(check % 2 == 0)
				countEven++;
			else
				countOdd++;
		}
		if(countEven > countOdd)
			System.out.println("READY FOR BATTLE");
		else
			System.out.println("NOT READY");
	}

}
