package com.MoodAnalyzer.MoodAnalysis;

public class MoodAnalyzer 
{
	private static String message;
	
	public static String MoodAnalyzer() {
		message="I am in Happy Mood";
		if(message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
	
	public static String MoodAnalyzer(String message) {
		if(message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

	
	
}
