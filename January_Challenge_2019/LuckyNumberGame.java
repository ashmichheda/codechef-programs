//package com.programs;

import java.util.Scanner;

/*public*/ class LuckyNumberGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			
			int n=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
			int sample[] = new int[n];
			int countForA = 0, countForB = 0;
			
			// logic for checking lucky number
			for(int i = 0; i<n; i++){
				
				sample[i] = sc.nextInt();
				if(sample[i] % a == 0 && sample[i] % b == 0){
					countForA++;
				}
				else if(sample[i] % a == 0)
					countForA++;
				else if(sample[i] % b == 0)
					countForB++;
				
			}
			
			if(countForA > countForB)
				System.out.println("BOB");
			else
				System.out.println("ALICE");
			
		}
		sc.close();
	}

}
