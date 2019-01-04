//package com.prog.CodeChefBeginner;

import java.util.HashMap;
import java.util.Scanner;

/*public*/ class LuckyFour {

	static HashMap <Integer, Integer> storedFrequency = new HashMap <Integer, Integer>();
	public static void main(String[] args) {
		
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0)
		{
			int findFreqNum = sc.nextInt();
			String temp = Integer.toString(findFreqNum);
			int length = temp.length();
			int input[] = new int[length];
			for(int i = 0; i< length; i++)
				input[i] = temp.charAt(i) - '0';
			
			frequencyCount(input, length);
			System.out.println(returnFrequency(4));
			storedFrequency.clear();
		}
		sc.close();
	}
	static void frequencyCount(int a[], int n) {
		
		for(int i = 0; i<n; i++) {
			if(storedFrequency.containsKey(a[i])) {
				storedFrequency.put(a[i], storedFrequency.get(a[i]) + 1);
			}
			else 
				storedFrequency.put(a[i], 1);
		}
				
		
	}
	// returns frequency of number 'x'
	static int returnFrequency(int number) {
		
		if(storedFrequency.containsKey(number)) {
			return storedFrequency.get(number);
		}
		return 0;
	}

}
