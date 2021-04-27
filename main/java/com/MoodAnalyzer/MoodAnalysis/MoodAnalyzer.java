package com.MoodAnalyzer.MoodAnalysis;

import java.util.*;

public class MoodAnalyzer 
{	
	public static String MoodAnalyzer() throws CustomException {
		String message=" ";
		try{
			if(message==" ")
				return "Empty";
			else
				return "HAPPY";
		}catch(NullPointerException e){
			throw new CustomException("Empty Mood.....Enter valid Mood");
		}
	}
	
	public static String MoodAnalyzer(String message) throws CustomException {
		try{
			if(message==" ")
				return "Empty";
			else
				return "HAPPY";
		}catch(NullPointerException e){
			throw new CustomException("Empty Mood.....Enter valid mood ");
		}
	}
}	

	class CustomException extends Exception{
		public CustomException(String message) {
		   super(message);
		}
	}
	

