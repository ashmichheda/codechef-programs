package com.prog.CodeChefPrograms;

import java.util.Scanner;

public class FitSquareInTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int m = 0;
			m = n/2;
			m = m *(m-1) / 2;
			System.out.println(m);
		}
		sc.close();

	}

}
