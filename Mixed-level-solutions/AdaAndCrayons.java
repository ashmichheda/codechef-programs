//package com.prog.CodeChefPrograms;
import java.util.Scanner;
public class AdaAndCrayons {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			String s = sc.next();
			s = s.replaceAll("U+","U");
			s = s.replaceAll("D+","D");
			System.out.println(s.length()/2);
		
		}
		sc.close();
	}

}
