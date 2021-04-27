package com.MoodAnalyzer.MoodAnalysis;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoodAnalyserTests 
{	
	@Test
    public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_SAD() throws CustomException
    {	
		try {
			String mood=MoodAnalyzer.MoodAnalyzer(" ");
			
			mood=MoodAnalyzer.MoodAnalyzer();
			
	        assertEquals("Empty",mood);
		}catch(CustomException e) {
			System.out.println(e);
		}
    }
	
	@Test
    public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_HAPPY () throws CustomException
    {	
		try {
			String mood=MoodAnalyzer.MoodAnalyzer(" ");
			
			mood=MoodAnalyzer.MoodAnalyzer();
			
	        assertEquals("Empty",mood);
		}catch(CustomException e) {
			System.out.println(e);
		}
    }
    
}
