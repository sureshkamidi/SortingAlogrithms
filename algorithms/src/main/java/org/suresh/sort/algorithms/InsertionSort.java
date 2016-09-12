package org.suresh.sort.algorithms;

/**
 * 
 * @author Suresh K
 * 
 * O(n^2) - 
 * Not useful for large data set
 */

public class InsertionSort {
	
	public static void main(String[] args) {
		
		Integer[] numbers = {14,33,27,10,35,19,42,44};
		
		int valueToInsert;
		int holePosition;
		for(int i = 1 ;i<numbers.length-1;i++){
			valueToInsert = numbers[i];
			holePosition = i;
			while ( holePosition > 0 && numbers[holePosition-1] > valueToInsert) {
				numbers[holePosition] = numbers[holePosition-1];
				holePosition--;
			}
			numbers[holePosition] = valueToInsert;
		}
		
		 for (Integer number : numbers) {
			 System.out.println(number);
		}
	}

}
