package com.MoodAnalyzer.MoodAnalysis;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTests 
{
	MoodAnalyzer moodanalyzer=new MoodAnalyzer();
    @Test
    public void testMoodAnalyzer_anyMOod_shouldReturn_Happy() throws Exception
    {
    	String mood=moodanalyzer.analyseMood("I am in Any Mood");
        assertEquals("HAPPY",mood);
    }
}
