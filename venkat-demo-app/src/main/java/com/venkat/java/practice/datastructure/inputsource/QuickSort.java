/**
 * 
 */
package com.venkat.java.practice.datastructure.inputsource;

import java.util.Arrays;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.venkat.java.practice.datastructure.source.SortingInputSource;
import com.venkat.java.practice.helper.PracticeHelper;

/**
 * @author vekannan
 *
 */
public class QuickSort {
	
	private int[] sortedArray; 
	private int length;
	private static final Logger LOGGER = Logger.getLogger(QuickSort.class.getName());
	public static void main(String[] args) {
		
		QuickSort QuickSorting = QuickSort.getInstance(SortingInputSource.getDefultSizeUnsortedIntArray());
		System.out.println(Arrays.toString(QuickSorting.getQuickSortedArray()));
	}
	
	public static QuickSort getInstance(int[] inputSource){
		QuickSort quickSort = new QuickSort(inputSource);
		return quickSort;
	}
	
	public int[] getQuickSortedArray(){
		if (sortedArray == null || sortedArray.length == 0) {
			return null;
	    }
        length = sortedArray.length;
        LOGGER.log(Level.INFO, "Quick Sorting Launched at " + PracticeHelper.getInstatnce().getCurrentTimeStamp());
        quickSort(0, length - 1);
        LOGGER.log(Level.INFO, "Quick Sorting Ends at " + PracticeHelper.getInstatnce().getCurrentTimeStamp());
		return sortedArray;
	}
	
	private void quickSort(int lowerIndex, int higherIndex) {
        
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = sortedArray[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (sortedArray[i] < pivot) {
                i++;
            }
            while (sortedArray[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        if (i < higherIndex)
            quickSort(i, higherIndex);
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = sortedArray[i];
        sortedArray[i] = sortedArray[j];
        sortedArray[j] = temp;
    }
     
	
	private QuickSort(int[] inputSource){
		this.sortedArray = inputSource;
	}

}
