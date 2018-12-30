package com.prog.CodeChefPrograms;

import java.util.Scanner;

 class Carvans {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			int count = 1;
			n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			
			// main Logic 
			
			if(n == 1)
				System.out.println(count);
			
			else
			{
				for(int i = 0; i< n-1; i++)
				{
					
					if(a[i+1] <= a[i])
						count++;
					else
						a[i+1] = a[i];
				}
				System.out.println(count);
			}
		}

		sc.close();
	}

}
