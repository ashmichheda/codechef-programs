package com.prog.CodeChefMedium;

import java.util.Scanner;

public class NumFact {
	static long t[];
	static long max = 0;
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    int t1 = sc.nextInt();
    while(t1-->0)
    {
        t = new long[1000000];
        max = 0;
        int n = sc.nextInt(),i;
        long m = 1;
        for(i=0;i<n;i++)
        	factors(sc.nextInt());//a[i]=sc.nextInt();
        for(i = 0; i<= max; i++)
        	m*=t[i]+1;
        System.out.println(m);
    }
    sc.close();
	}
	static void factors(int n)
    {
        int i, n1 = n;
        for(i = 2; i <= Math.sqrt(n); i++)
        {
            if(n1%i == 0)
            {
                
                while(n1%i == 0)
                {
                    n1 = n1/i;
                    t[i]++;
                }
                if(i>max)
                	max=i;
            }
        }
        if(n1!=1)
        {
        	t[n1]++;
        	if(n1>max)
        		max=n1;
        }
    }
	
}
