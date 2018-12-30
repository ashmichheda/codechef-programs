package com.prog.CodeChefPrograms;


import java.util.Scanner;

public class DishOfLife {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			boolean some = false, all = false;
			boolean check[] = new boolean [k+1];
			int count=0;
			for(int i=0;i<n;i++)
			{
				int size = sc.nextInt();
				for(int j = 0; j<size; j++)
				{
					int p = sc.nextInt();
					if(check[p] == false)
					{
						check[p] = true;
						count++;
					}
				}
				if(count == k&&i<n-1)
					some = true;
				if(count == k&& i== n-1)
					all=true;
			}
			if(some)
			System.out.println("some");
			else if(all)
			System.out.println("all");
			else
			System.out.println("sad");
		}
		sc.close();
	}

}
