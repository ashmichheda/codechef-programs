package com.prog.CodeChefPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class ChefAndSums {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			int tempArray[] = new int[n];
			int leastIndex = 0, leastSum = 0 ,preSum, suffixSum;
			// taking input
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<n; i++)
				a[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 1; i<=n; i++)
			{
				leastIndex = i;
				preSum = 0; suffixSum = 0;
				preSum = getPrefixSum(a,leastIndex);
				suffixSum = getSuffixSum(a,n,leastIndex);
				leastSum = preSum + suffixSum;
				tempArray[i-1] = leastSum;
			}
			HashMap<Integer, Integer> sortValues = new HashMap<Integer,Integer>();
			for(int i = 0; i<n; i++)
			{
				sortValues.put(i+1, tempArray[i]);
			}
			Map<Integer,Integer> sortMap = sortByComparator(sortValues);
			int result = printMap(sortMap);
			//Arrays.sort(tempArray);
			
			System.out.println(/*"least index is: "+*/result);
			
		}
	}

	private static int getPrefixSum(int[] a, int leastIndex) {
		int preSum = 0;
		for(int i = 0; i<leastIndex; i++)
			preSum = preSum + a[i];
		return preSum;
	}

	private static int getSuffixSum(int[] a, int n, int leastIndex) {
		int countSuffix = n - leastIndex + 1;
		int j = n-1, sumSuffix = 0;
		while(countSuffix-- > 0)
		{
			sumSuffix = sumSuffix + a[j];
			j--;
		}
		return sumSuffix;
	}
	public static Map<Integer,Integer> sortByComparator(Map<Integer,Integer> map)
	{
		List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(map.entrySet());
		
		// sorting map based on values
		Collections.sort(list, new Comparator<Entry<Integer,Integer>>()
			{
				 public int compare(Entry<Integer, Integer> o1,
		                    Entry<Integer, Integer> o2)
		            {
		                
		                    return o1.getValue().compareTo(o2.getValue());
		          
		            }
		        });
		 // Maintaining insertion order with the help of LinkedList
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        
        for (Entry<Integer, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
		
	}
	public static int printMap(Map<Integer,Integer> map)
	{
		int result = 0;
		for(Entry<Integer,Integer> entry : map.entrySet())
		{
			result = entry.getKey();
			break;
		}

		return result;
	}

}
