//package com.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*public*/ class PrintPattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int t;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
		    
		    int n = Integer.parseInt(br.readLine());
		    int temp = n*n;
		    List<Integer> values = new ArrayList<Integer>();
		    for(int j = 0; j < temp; j++) {
		        values.add(j+1);
		    }
		    int[][] arr = new int[n][n];
		    int count = 0;
		    
		    // pattern logic
		    for(int k = 0; k < n; k++) {
		      for(int l = 0; l < n; l++) {
		          if(arr[k][l] == 0) {
		              int temp1 = k;
		              int temp2 = l;
		              while(temp1 < n && temp2 >= 0) {
		                  arr[temp1][temp2] = values.get(count++);
		                  temp1++;
		                  temp2--;
		              }
		          }
		      }
		    }
		    
		    for(int m = 0; m<n;m++) {
		       for(int p = 0; p<n;p++) {
		            System.out.print(arr[m][p] + " ");
		        } 
		        System.out.println();
		    }
		    
		}

	}

}
