package com.prog.CodeChefEasy;

import java.util.Scanner;

public class CleaningUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int total = sc.nextInt();
			int completedJobs = sc.nextInt();
			int[] jobs = new int[total+1];
			int flag = 0;
			String bossList = "";
			String empList = "";
			for(int i = 0; i < completedJobs; i++){
				int temp = sc.nextInt();
				jobs[temp] = 1;
			}
			for(int j = 1; j < jobs.length; j++){
				if(jobs[j] == 0){
					if(flag == 0){
						bossList += j+" ";
						flag = 1;
					}
					else{
						empList += j+" ";
						flag = 0;
					}
				}
			}
			System.out.print(bossList+"\n"+empList+"\n");
		}
		sc.close();
	}
}
