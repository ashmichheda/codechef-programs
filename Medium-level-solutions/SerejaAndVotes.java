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
	        
	        int count = 0, sum = 0;
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i = 0; i<n; i++){
	            a[i] = sc.nextInt();
	        }
	        
	        // check for count
	        for(int i = 0; i<n; i++){
	            
	            if(a[i] != 0){
	                count++;
	            }
	        }
	        
	        // get sum of elements
	        for(int i = 0; i<n; i++){
	           sum += a[i];
	        }
	        
	        if(sum < 100)
	            System.out.println("NO");
	        if(sum == 100)
	            System.out.println("YES");
	        if(sum > 100){
	            if((sum - 100) < count){
	                System.out.println("YES");
	            }
	            else
	                System.out.println("NO");
	        }
	    }
	}
}
