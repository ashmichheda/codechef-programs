package com.prog.CodeChefPrograms;

import java.util.ArrayList;
import java.util.List;

public class MaxUniqueSegment {

	public static void main(String[] args) {
		
		 List<Integer> A = new ArrayList<Integer>();
		    A.add(0);
		    A.add(1);
		    A.add(2);
		    A.add(0);
		    A.add(2);
		    System.out.println("global list to study: " + A);

		    //global list
		    List<List<Integer>> listOfUniqueList = new ArrayList<List<Integer>>();      

		    // iterate on 1st position in list, start at 0
		    for (int initialPos=0; initialPos<A.size(); initialPos++) {

		        // iterate on liste size, start on full list and then decrease size
		        for (int currentListSize=A.size()-initialPos; currentListSize>0; currentListSize--) {

		            //initialize current list.
		            List<Integer> currentList = new ArrayList<Integer>();

		            // iterate on each (corresponding) int of global list
		            for ( int i = 0; i<currentListSize; i++) {
		                currentList.add(A.get(initialPos+i));
		            }

		            // insure unicity
		            if (!listOfUniqueList.contains(currentList)){
		                listOfUniqueList.add(currentList);                      
		            } else {
		                continue;
		            }
		            
		        }
		    }
		    System.out.println("list retrieved: " + listOfUniqueList);
		    System.out.println("size of list retrieved: " + listOfUniqueList.size());
	}

}
