package com.prog.CodeChefEasy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Stone {

		public static void main(String[] args) throws NumberFormatException, IOException {
			
				Scanner sc = new Scanner(System.in);
			
				int n = sc.nextInt();
				int k = sc.nextInt();
				long stone[] = new long[n];
				long stoneTemp[] = new long[n];
				for(int i = 0; i<n; i++)
				{
					stone[i] =  sc.nextLong();
					stoneTemp[i] = stone[i];
				}
				Arrays.sort(stoneTemp);
				long max = stoneTemp[n-1] - stoneTemp[0];
				long temp1[] = new long[n];
				for(int i = 0; i<n; i++)
					temp1[i] = stoneTemp[n-1] - stone[i];
				
				long temp2[] = new long[n];
				for(int i = 0; i<n; i++)
					temp2[i] = max - temp1[i];
				if(k == 0)
				{
					for(int i = 0; i<n; i++)
						System.out.print(stone[i]+" ");
				}
				else if(k%2 == 1)
				{
					for(int i = 0; i<n; i++)
						System.out.print(temp1[i]+" ");
				}
				else
				{
					for(int i = 0; i<n; i++)
						System.out.print(temp2[i]+" ");
				}
				System.out.println();
				sc.close();
	}

}
