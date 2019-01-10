/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t--> 0){
	        int favourCount = 0, againstCount = 0, neutralCount = 0;
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i = 0; i<n; i++){
	            a[i] = sc.nextInt();
	        }
	        
	        // logic to check whether to rename this city or not
	         for(int i = 0; i<n; i++){
	            if(a[i] == 1){
	                favourCount++;
	            }
	            else if(a[i] == -1)
	                againstCount++;
	            else{
	                neutralCount++;
	            }
	        }
	        if(favourCount >= againstCount)
	            System.out.println("YES");
	        else    
                System.out.println("NO");
	    }
	}
}
