package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicianVsChef {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int goldPosition = (Integer.parseInt(input[1])) - 1;
			int swaps =Integer.parseInt(input[2]);
			int goldArray[] = new int[n];
			// fill up the array with 0s and 1s for gold coin
			for(int i = 0; i<n; i++)
			{
				if(i == goldPosition)
					goldArray[i] = 1;
				else
					goldArray[i] = 0;
			}
			
			// taking input
			int temp = 0, finalPosition = goldPosition+1;
			for(int i = 0; i<swaps; i++) {
				String swapInput[] = br.readLine().split(" ");
				int swapA = (Integer.parseInt(swapInput[0])) - 1;
				int swapB = (Integer.parseInt(swapInput[1])) - 1;
				// perform swaps
					if(goldArray[goldPosition] == goldArray[swapA]) {
						temp = goldArray[swapA];
						goldArray[swapA] = goldArray[swapB];
						goldArray[swapB] = temp;
						finalPosition = swapB + 1;
						goldPosition = swapB;
					}
					else if(goldArray[goldPosition] == goldArray[swapB]) {
						temp = goldArray[swapB];
						goldArray[swapB] = goldArray[swapA];
						goldArray[swapA] = temp;
						finalPosition = swapA + 1;
						goldPosition = swapA;
					}
					else
						continue;
			}
			System.out.println(finalPosition);
		}
	}

}
