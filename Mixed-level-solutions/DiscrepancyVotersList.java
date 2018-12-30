package com.prog.CodeChefPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiscrepancyVotersList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int n = n1+n2+n3;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> finalList = new ArrayList<Integer>();
		while(n-- > 0)
		{
			list.add(sc.nextInt());
		}
		
		// sort list in asc order
		Collections.sort(list);
		int count = 0, num = 0;
		for( int i = 0; i<list.size(); i++)
		{
			if(i == 0)
			{
				num = list.get(i);
				count = 1;
			}
			
			else
			{
				if(num == list.get(i))
					count++;
				else
				{
					if(count >= 2)
					{
						finalList.add(num);
					}
					
					count = 1;
					num = list.get(i);
				}
			}
		}
			
			// printing finalList size and its elements
			System.out.println(finalList.size());
			
			for(int i= 0; i<finalList.size(); i++)
			{
				System.out.println(finalList.get(i));
			}
			sc.close();
	}

}
