/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t, g, heads, tails, temp,i, n, q;
		
		t = Integer.parseInt(br.readLine());
		while(t--> 0){
		    g = Integer.parseInt(br.readLine());
		    while(g-- > 0){
		        
		    String input[] = br.readLine().split(" ");
		    i = Integer.parseInt(input[0]);
		    n = Integer.parseInt(input[1]);
		    q = Integer.parseInt(input[2]);
		    
		    if(n % 2 != 0){
		        heads = n/2;
		        tails = heads + 1;
		    }
		    else{
		        heads = tails = n/2;
		    }
		    
		    if(i == 2){
		        temp = heads;
		        heads = tails;
		        tails = temp;
		    }
		    // print heads
		    if(q == 1)
		        System.out.println(heads);
		   // print tails     
		    else
		        System.out.println(tails);
		    }
		}
	}
}
