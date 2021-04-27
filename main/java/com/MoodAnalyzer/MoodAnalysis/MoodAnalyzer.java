package com.MoodAnalyzer.MoodAnalysis;

import java.util.*;

public class MoodAnalyzer 
{	
	public static String MoodAnalyzer() throws CustomException {
		Scanner sc=new Scanner(System.in);
		String message=sc.nextLine();
		try{
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}catch(NullPointerException e){
			throw new CustomException("Invalid Mood.....Enter valid Mood");
		}
	}
	
	public static String MoodAnalyzer(String message) throws CustomException {
		try{
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}catch(NullPointerException e){
			throw new CustomException("Invalid Mood.....Enter valid mood ");
		}
	}
}	

	class CustomException extends Exception{
		public CustomException(String message) {
		   super(message);
		}
	}
	

