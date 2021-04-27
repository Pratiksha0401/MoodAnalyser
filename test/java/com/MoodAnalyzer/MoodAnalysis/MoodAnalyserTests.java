package com.MoodAnalyzer.MoodAnalysis;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoodAnalyserTests 
{	
	@Test
    public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_SAD() throws CustomException
    {	
			String mood=MoodAnalyzer.MoodAnalyzer(" ");	
			mood=MoodAnalyzer.MoodAnalyzer();
	        assertEquals("Empty",mood);
    }
	
	@Test
    public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_HAPPY () throws CustomException
    {	
		
			String mood=MoodAnalyzer.MoodAnalyzer(" ");
			mood=MoodAnalyzer.MoodAnalyzer();
	        assertEquals("Empty",mood);
		
    }
    
}
