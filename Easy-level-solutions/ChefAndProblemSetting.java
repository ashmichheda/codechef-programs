package com.prog.CodeChefEasy;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndProblemSetting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String ans[] = new String[t];
		Arrays.fill(ans, "OK");
		for(int i = 0; i < t; i++) {
			int N,M;
			N=sc.nextInt();
			M=sc.nextInt();
			sc.nextLine();
			String str[]=new String[N];
			String bin[]=new String[N];
			for(int y=0;y<N;y++) {
				str[y]=sc.next();
				bin[y]=sc.next();
			}
			for(int j=0;j<N;j++) {
				int count_0=0;
				for(int x=0;x<M;x++){
					if(bin[j].charAt(x)=='0') {
						count_0++;
					}
				}
				if(count_0!=0 && str[j].equals("correct")) {
					ans[i]="INVALID";
					
				}
				else if(count_0==0 && str[j].equals("wrong")){
					if(!ans[i].equals("INVALID"))
					ans[i]="WEAK";
					
				}
				else {
					if(j==N-1 && !ans[i].equals("INVALID") && !ans[i].equals("WEAK")) {
					ans[i]="FINE";
					}
				}
			}
			
		}
		for(int p = 0; p<t; p++) {
			System.out.println(ans[p]);
		}
		sc.close();
	}

}
