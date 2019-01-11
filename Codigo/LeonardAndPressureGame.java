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
		int n = Integer.parseInt(br.readLine());
		int p[] = new int[n];
		int h[] = new int[n];
		int sum = 0;
		
		// take pressure and height input
		for(int i = 0; i<n; i++){
		    String input[] = br.readLine().split(" ");
		    p[i] = Integer.parseInt(input[0]);
		    h[i] = Integer.parseInt(input[1]);
		    sum += h[i];
		}
		
		long a[] = new long[sum+1];
		a[0] = 0;
		int count = 0;
		for(int i = 0; i<n; i++){
		    for(int j = 0; j<h[i]; j++){
		        count++;
		        a[count] = a[count-1] + p[i];
		        
		    }
		}
		
		/*	for(int i = 0; i<(sum+1); i++){
		    System.out.print("array a["+i+"]"+" contents: "+a[i]);
		    System.out.println();
		}*/
		
		int q = Integer.parseInt(br.readLine());
		for(int i = 0; i<q; i++){
		    String range[] = br.readLine().split(" ");
		    int l = Integer.parseInt(range[0]);
		    int r = Integer.parseInt(range[1]);
		    System.out.println((a[r] - a[l]) * 10);
		}
		
	}
}
