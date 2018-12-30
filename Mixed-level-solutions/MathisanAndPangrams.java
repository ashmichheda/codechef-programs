package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MathisanAndPangrams {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        int results[] = new int[T];
        for (int t = 0; t < T; t++) {
            results[t] = 0;
            int price[] = new int[26];
            for (int i = 0; i < 26; i++) 
            {
                price[i] = sc.nextInt();
            }
            String N = sc.next();
            N = N.toLowerCase();
            System.out.println("n index: "+N.indexOf('n') +(int)N.charAt(12));
            for (char i = 'a'; i <= 'z'; i++) 
            {
                if (N.indexOf(i) < 0) 
                {
                    results[t] = results[t] + price[(int) i - 97];
                }
            }
        }
 
        for (int t = 0; t < T; t++) {
            System.out.println(results[t]);
        }

	}

}
