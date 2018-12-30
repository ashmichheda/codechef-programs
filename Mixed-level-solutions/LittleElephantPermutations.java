package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class LittleElephantPermutations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			n = sc.nextInt();
			int a[] = new int[n];
			int inversions = 0, localInversions = 0;
			//taking input
			for(int i = 0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			
			//logic for finding count of inversions
			
			for(int i = 0; i<n-1; i++)
			{
				for(int j = 1; j<n; j++)
				{
					if(i < j)
					{
						if(a[i] > a[j])
							inversions++;
					}
				}
			}
			
			// logic for finding count of local inversions
			for( int i = 0; i<n-1; i++)
			{
				if(a[i] > a[i+1])
					localInversions++;
			}
			
			if(inversions == localInversions)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		sc.close();
	}

}
