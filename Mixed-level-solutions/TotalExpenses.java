package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalExpenses {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			double quantity = Double.parseDouble(input[0]);
			double pricePerItem = Double.parseDouble(input[1]);
			double purchase = 0;
			if(quantity > 1000)
			{
				purchase = quantity*pricePerItem*0.9;
			}
			
			else
			{
				purchase = quantity*pricePerItem;
				
			}
			System.out.printf("%.6f\n",purchase);
			
		}

	}

}
