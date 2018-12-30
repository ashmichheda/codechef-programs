package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class ClassIdDisplay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			char input;
			input = sc.next().charAt(0);
			
			if(input == 'B' || input == 'b')
				System.out.println("BattleShip");
			if(input == 'C' || input == 'c')
				System.out.println("Cruiser");
			if(input == 'D' || input == 'd')
				System.out.println("Destroyer");
			if(input == 'F' || input == 'f')
				System.out.println("Frigate");
			
			
		}

		sc.close();
	}

}
