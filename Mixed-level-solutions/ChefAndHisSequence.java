package com.prog.CodeChefPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class ChefAndHisSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			String input = sc.next();
			int n = input.length();
			char inputChar[] = input.toCharArray();
			int num = 1,countNum = 1, init = 1;
			
			HashSet<Integer> nos = new HashSet<>();
			nos.add(1);
			char tempSymbol;
			for(int i = 0; i<n; i++)
			{
				tempSymbol = inputChar[i];
				
				// check for <
				if(tempSymbol == '<')
				{
					if(init < num)
					{
						countNum++;
						init = num;
						nos.add(num);
						if(i == n-1)
							break;
						else
						{
								
							if(inputChar[i+1] == '<' && (i+1) < n)
								num++;
							else if(inputChar[i+1] == '>' && (i+1) < n)
								num--;
							else{
								
							}
						}
					}
					else
					{
						num++;
						if(init < num)
						{
							countNum++;
							init = num;
							nos.add(num);
							if(inputChar[i+1] == '<' && (i+1) < n)
								num++;
							else if(inputChar[i+1] == '>' && (i+1) < n)
								num--;
							else{
								
							}
						}
						
					}
					
				}
					
				// check for >
				else if(tempSymbol == '>')
				{
					if(init > num)
					{
						countNum++;
						init = num;
						nos.add(num);
						if(i == n-1)
							break;
						else
						{
								
							if(inputChar[i+1] == '<' && (i+1) < n)
								num++;
							else if(inputChar[i+1] == '>' && (i+1) < n)
								num--;
							else{
								
							}
						}
					}
					else
					{
						num++;
						if(init > num)
						{
							countNum++;
							init = num;
							nos.add(num);
							if(inputChar[i+1] == '<' && (i+1) < n)
								num++;
							else if(inputChar[i+1] == '>' && (i+1) < n)
								num--;
							else{
								
							}
						}
					}
					
				}
				
				// check for =
				else if(tempSymbol == '=')
				{
					if(init == num)
					{
						countNum++;
						init = num;
						nos.add(num);
						if(i == n-1)
							break;
						else
						{
								
							if(inputChar[i+1] == '<' && (i+1) < n)
								num++;
							else if(inputChar[i+1] == '>' && (i+1) < n)
								num--;
							else{
								
							}
						}
					}
					else
					{
						
						num++;
						if(init == num)
						{
							countNum++;
							init = num;
							nos.add(num);
							if(inputChar[i+1] == '<' && (i+1) < n)
								num++;
							else if(inputChar[i+1] == '>' && (i+1) < n)
								num--;
							else{
								
							}
						}
						
						
						
						
						/*if(init < num)
						{
							num++;
							if(init == num)
							{
								countNum++;
								init = num;
								nos.add(num);
								num = 1;
							}
						}
						else
						{
							num--;
							if(init == num)
							{
								countNum++;
								init = num;
								nos.add(num);
								num = 1;
							}
						}*/
					}
					
				}	
					
					
					
					if(countNum == n+1)
						break;
				
			}
			System.out.println(/*"nos are: "+*/nos.size());
		}
		sc.close();

	}

}
