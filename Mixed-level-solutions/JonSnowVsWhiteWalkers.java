package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JonSnowVsWhiteWalkers {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t;
	        t = Integer.parseInt(br.readLine());
	        while(t-- > 0)
	        {
	            String input[] = br.readLine().split(" ");
	            int n = Integer.parseInt(input[0]);
	            int m = Integer.parseInt(input[1]);

	            int snow[] = new int[n];
	            int white[] = new int[m];
	            int sumSnow = 0, sumWhite = 0;

	            StringTokenizer st = new StringTokenizer(br.readLine());
	            StringTokenizer st1 = new StringTokenizer(br.readLine());
	            // taking input
	            for(int i = 0; i<n; i++)
	            {
	                snow[i] = Integer.parseInt(st.nextToken());
	                sumSnow = sumSnow + snow[i];
	            }

	            for(int i = 0; i<m; i++)
	            {
	                white[i] = Integer.parseInt(st1.nextToken());
	                sumWhite = sumWhite + white[i];
	        
	            }
	            //System.out.println("sumWhite: "+sumWhite+" sumsnow: "+sumSnow);
	            
	            if(sumSnow > sumWhite)
	                System.out.println("Snow");
	            else
	                System.out.println("Death");
	        }
	    }
}
