package com.MoodAnalyzer.MoodAnalysis;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class MoodAnalyserTests 
{	
	@Test
    public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_SAD()
    {	
		String mood=MoodAnalyzer.MoodAnalyzer();
		System.out.println(mood);
        assertEquals("SAD",mood);
    }
    
}
