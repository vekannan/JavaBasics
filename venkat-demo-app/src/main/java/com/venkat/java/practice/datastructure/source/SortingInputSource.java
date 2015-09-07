/**
 * 
 */
package com.venkat.java.practice.datastructure.source;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vekannan
 *
 */
public class SortingInputSource {
	private static final Logger LOGGER = Logger.getLogger(SortingInputSource.class.getName());
	static int[] unsortedRandomArray;
	final static int defaultArraySize = 10;
	
	public static int[] getDefultSizeUnsortedIntArray(){
		LOGGER.log(Level.INFO, "Creating defaultsize(10) array of type int");
		unsortedRandomArray = new int[defaultArraySize];
		for(int i = 0; i < defaultArraySize; i++ ){
			unsortedRandomArray[i] =  (int)(Math.random()*100);
		}
		LOGGER.log(Level.INFO, "Unsorted Array ==>"+Arrays.toString(unsortedRandomArray));
		return unsortedRandomArray;
	}
	
	

}
