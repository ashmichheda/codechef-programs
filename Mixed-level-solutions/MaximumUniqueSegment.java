package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class MaximumUniqueSegment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int t=Integer.parseInt(br.readLine());
	        int count=0;
	        while(count<t){
	        
	            int n=Integer.parseInt(br.readLine());
	            String s=br.readLine();
	            String r=br.readLine();
	            String s1[]=s.split(" ");
	            String r1[]=r.split(" ");
	            
	            
	            int c[]=new int[n];
	            int w[]=new int[n];
	            
	            for(int i=0;i<n;i++){
	            
	                c[i]=Integer.parseInt(s1[i]);
	                w[i]=Integer.parseInt(r1[i]);
	                
	            }
	            
	            long max=0;
	            for(int i=0;i<n;i++){
	            
	                int a[]=new int[n];
	                HashSet<Integer> h=new HashSet<>();
	                long sum=0;
	                for(int j=i;j<n;j++){
	                
	                    if(!h.contains(c[j])){
	                    
	                        h.add(c[j]);
	                        sum=sum+w[j];
	                        a[c[j]]=j;
	                    }
	                    else{
	                    
	                        i=a[c[j]];
	                        break;
	                    }
	                        
	                }
	                if(sum>max)
	                    max=sum;
	            }
	            
	            
	            System.out.println(max);
	            
	            count++;
	        }

	}

}
