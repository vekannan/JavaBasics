package com.venkat.java.practice.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PracticeHelper {
	
	public static PracticeHelper getInstatnce(){
		PracticeHelper practiceHelper = new PracticeHelper();
		return practiceHelper;
	}
	
	public String getCurrentTimeStamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Calendar.getInstance().getTime());
	}
	
	private PracticeHelper(){
		
	}
}
