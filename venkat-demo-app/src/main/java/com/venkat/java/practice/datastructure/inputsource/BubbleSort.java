package com.venkat.java.practice.datastructure.inputsource;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.venkat.java.practice.datastructure.source.SortingInputSource;

public class BubbleSort {
	private static int[] arrayToSort;
	private static int swapCount;
	private static final Logger LOGGER = Logger.getLogger(BubbleSort.class.getName());

	public static BubbleSort getInstatnce(int[] sortArray){
		return new BubbleSort(sortArray); 
	}
	
	public static void main(String[] args) {
		BubbleSort bubbleSorting = BubbleSort.getInstatnce(SortingInputSource.getDefultSizeUnsortedIntArray());
		bubbleSorting.bubbleSort();
		LOGGER.log(Level.INFO, "Sorted Array ==> " + Arrays.toString(arrayToSort) + "from " +swapCount +" swaps");
	}
	
	public int[] getBubbleSortedArray(){
		bubbleSort();
		LOGGER.log(Level.INFO, "Sorted Array ==> " + Arrays.toString(arrayToSort) + "from " +swapCount +" swaps");
		return arrayToSort;
	}
	
	
	private void bubbleSort(){
		for(int i = 0; i < arrayToSort.length; i++){
			for(int j = 0 ; j < arrayToSort.length-1 ; j++ ){
				int k = j+1;
				swapCount += ((arrayToSort[j] > arrayToSort[k] ) ? swapArray(j, k) : 0 );
			}
		}
	}
	
	private static int swapArray(int i , int j){
		int temp = arrayToSort[i] ;
		arrayToSort[i] = arrayToSort[j];
		arrayToSort[j] = temp;
		return 1;
	}
	
	private BubbleSort(int[] sortArray){
		arrayToSort = sortArray;
	}

}
