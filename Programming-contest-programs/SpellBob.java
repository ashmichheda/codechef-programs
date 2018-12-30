package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpellBob {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String a = br.readLine();
			String b = br.readLine();
			char temp1 [] = a.toCharArray();
			char temp2 [] = b.toCharArray();
			int countOfOs = 0, countOfBs = 0, temp1Len = temp1.length, temp = 0;
			outer: for(int i = 0; i<temp1Len; i++) {
				if(temp1[i] == 'b')
					countOfBs++;
				else if(temp1[i] == 'o')
					countOfOs++;
				else {
					temp = i;
					for(int j = temp; j<temp1Len; j++) {
						if(temp2[j] == 'b')
						{
							countOfBs++;
							continue outer;
						}
						else if(temp2[j] == 'o')
						{
							countOfOs++;
							continue outer;
						}
						else
							continue outer;
					}
				}
			}
			// find for 'o'
			if(countOfBs == 3) {
				countOfBs--;
				for(int j = 0; j<temp1Len; j++) {
					if(temp2[j] == 'o' && countOfOs != 1)
					{
						countOfOs++;
					}
				}
				
			}
			// find for 'b'
			if(countOfOs > 1) {
				countOfOs = 1;
				for(int j = 0; j<temp1Len; j++) {
					if(temp2[j] == 'b' && countOfBs != 2)
					{
						countOfBs++;
					}
				}
				
			}
			if(countOfBs == 2 && countOfOs == 1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
