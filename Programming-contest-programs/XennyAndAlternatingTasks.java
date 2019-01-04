//package com.prog.CodeChefCompetitionsProgs;

import java.util.Scanner;

/*public*/ class XennyAndAlternatingTasks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		while(t-- > 0)
		{
			int sum1 = 0,sum2 = 0;
			n = sc.nextInt();
			int a1[] = new int[n];
			int a2[] = new int[n];
			for(int i = 0; i<n; i++)
			{
				a1[i] = sc.nextInt();
			}
			
			for(int i = 0; i<n; i++)
			{
				a2[i]  = sc.nextInt();
			}
			
			// Alternate task completion in 
			// minimum time logic
			
			for(int i = 0; i<n; i++)
			{
				if(i < n-1)
				{
					sum1 = sum1 + a1[i]+a2[i+1];
					i++;
				}
				else 
					sum1 = sum1 + a1[i];
			}
			
			for(int i = 0; i<n; i++)
			{
				if(i < n-1)
				{
					sum2 = sum2 + a2[i]+a1[i+1];
					i++;
				}
				else 
					sum2 = sum2+a2[i];
			}
			
			if(sum1 < sum2)
				System.out.println(sum1);
			else
				System.out.println(sum2);
			
		}
		sc.close();
	}

}
