package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class BandMatr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			
			n = sc.nextInt();
			int arr[][] = new int[n][n];
			int numberOfOnes = 0;
			for( int i=0; i<n; i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j] = sc.nextInt();
					if(arr[i][j] == 1)
					{
					   numberOfOnes++;
					}
					   
				}
			}
			//System.out.println(number_of_ones);
			int p = n;
			int num = p;
			int i ;
			for(i=0;i<n;i++)
			{
				if(numberOfOnes > num)
					{
						numberOfOnes = numberOfOnes - num;
					}
				else{
					
					break;
				}
				p--;
				num = 2*(p);
			   // System.out.println("number_of_ones"+numberOfOnes+"num"+num);
			}
			
			
			System.out.println(i);
			
			
			
			
			
		}
		
		sc.close();
	}

}
