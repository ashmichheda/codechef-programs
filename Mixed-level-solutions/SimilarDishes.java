package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SimilarDishes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int count = 0;
			// taking input
			List<String> dish1 = new ArrayList<String>();
			List<String> dish2 = new ArrayList<String>();
			String input1[] = br.readLine().split(" ");
			String input2[] = br.readLine().split(" ");
			for(int i = 0; i<4; i++)
				dish1.add(input1[i]);
			
			for(int i = 0; i<4; i++)
				dish2.add(input2[i]);
			
			//ANOTHER WAY FOR SOLVING
			/*//dish1.retainAll(dish2);
			Set<String> set = new HashSet<String>();
			set.addAll(dish1);
			set.retainAll(dish2);
			count = set.size();
			
			if(count >= 2)
				System.out.println("similar");
			
			else
				System.out.println("dissimilar");*/
			
			
			
			// logic for checking the similarity
			//dish1 = dish1.toString().toLowerCase();
			outer: for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					if(dish1.get(i).equals(dish2.get(j)))
						count++;
					
					if(count == 2)
						break outer;
				}
			}
			
			if(count == 2)
				System.out.println("similar");
			else
				System.out.println("dissimilar");
		}

	}

}
