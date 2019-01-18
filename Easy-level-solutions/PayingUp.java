//package com.programs;

import java.util.Scanner;

/*public*/ class PayingUp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t -- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int notes[]=new int[n];
			for(int i=0;i<n;i++) {
				notes[i] = sc.nextInt();
			}
			int sum=0;
			int flag=0;
			for(int i=0;i<Math.pow(2, n);i++) {
				for(int j = 0; j < n; j++) {
					if((i & (1 << j))>0) {
						sum = sum + notes[j];
					}
				}
				
				if(sum==m) {
					flag=1;
					break;
				}
				sum=0;
			}
			if(flag==1) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
		sc.close();
	}

}

