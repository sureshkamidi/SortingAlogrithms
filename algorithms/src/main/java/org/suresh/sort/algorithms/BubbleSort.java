package org.suresh.sort.algorithms;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Integer[] numbers = {14,33,27,35,10};
		
		 for (int i=0;i<numbers.length-1;i++) {
			 boolean isSwapped = false;
			 for(int j=0;j<numbers.length-1;j++) {
				 if (numbers[j] > numbers[j+1]) {
					 int temp = numbers[j];
					 numbers[j] = numbers[j+1];
					 numbers[j+1]= temp;
					 isSwapped = true;
				 }
			 }
			 if (!isSwapped) {
				 break;
			 }
		 }
		
		 for (Integer number : numbers) {
			 System.out.println(number);
		}
		 
	}

}
