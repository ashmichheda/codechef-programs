//package com.prog.CodeChefMedium;

import java.util.Scanner;

/*public*/ class TheNextPalindromeModify {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);			
		int T = in.nextInt();
		in.nextLine();
		while(T-->0)
		{
			String s = in.nextLine();
			int l = s.length();
			char ch[] = s.toCharArray();
			int carry = 1,j;
			for(j=l-1; j>(l-1)/2; j--) 
			{
				if(ch[j]+carry > ch[l-1-j])
					carry = 1;
				else
					carry = 0;
				ch[j] = ch[l-1-j];
			}
			while(carry == 1 && j>=0)
			{
				if(ch[j] == '9')
					ch[j] = '0';
				else
				{
					ch[j] += 1;
					carry = 0;
				}
				ch[l-1-j] = ch[j];
				j--;
			}
			int pofix = 0;
			if(j < 0 && carry == 1)
			{
				pofix = '1';
				ch[0] = '1';
			}
			if(pofix != 0)
				System.out.println(String.valueOf(ch)+"1");
			else
				System.out.println(String.valueOf(ch));
		}
	in.close();
	}

}
