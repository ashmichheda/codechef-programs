package com.prog.CodeChefPrograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BossAndHisBrother {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t;
	        t = Integer.parseInt(br.readLine());
	        while(t-- > 0)
	        {
	        	String input[] = br.readLine().split(" ");
	            int n = Integer.parseInt(input[0]);
	            int m = Integer.parseInt(input[1]);
	            int count = 0, sum = 0;
	            int total = n*(n+1)/2;
	            if(m <= total)
	            {
		            for(int i = 1; i <= n; i++)
		            {
		            	sum = sum + i;
		            	if(sum >= m)
		            	{
		            		count++;
		            		break;
		            	}
		            	else
		            		count++;
		            }
		            System.out.println(count);
	            }
	            else
	            	System.out.println("-1");
	            	
	            
	        }

	}

}
