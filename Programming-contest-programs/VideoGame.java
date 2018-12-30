package com.prog.CodeChefCompetitionsProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class VideoGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int h = Integer.parseInt(input[1]);
		int a[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++)
            a[i] = Integer.parseInt(st.nextToken());
		
		// taking input for sequence of instructions for the crane
		List<Integer> sequence = new ArrayList<Integer>();
		while(true)
		{
			sequence.add(Integer.parseInt(st1.nextToken()));
			if(sequence.contains(0))
				break;
		}
		
		int k = 0, step = 0, seqLength = sequence.size();
		boolean isItemPicked = false;
		int result[] = playVideoGame(a,seqLength, k, step, isItemPicked, h, sequence, n);
		
		for(int i = 0; i<n; i++)
			System.out.print(result[i]+" ");

	}

	private static int[] playVideoGame(int[] a, int seqLength, int k, int step, boolean isItemPicked, int h, List<Integer> sequence, int n) {
		outer: for(int i = 0; i<seqLength; i++)
		{
			step = sequence.get(i);
			if(step != 0)
			{
				if(k < n)
				{
					if(step == 3)
					{
						if(a[k]  != 0 && (!isItemPicked))
						{
							a[k] = a[k] - 1;
							isItemPicked = true;
							continue outer;
						}
						else
							continue outer;
							
					}
					if(step == 2)
					{
						if(k != n-1)
						{
							k++;
							continue outer;
						}
						else
							continue outer;
					}
					if(step == 4)
					{
						if(a[k] < h)
						{
							a[k] = a[k] + 1;
							isItemPicked = false;
							continue outer;
						}
						else
							continue outer;
							
					}
					if(step == 1)
					{
						if(k != 0)
						{
							k--;
							continue outer;
						}
						else
							continue outer;
					}
				}
			}
			else
				return a;
		}
		return a;
	}

}
