package com.MoodAnalyzer.MoodAnalysis;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTests 
{
	MoodAnalyzer moodanalyzer=new MoodAnalyzer();
    @Test
    public void testMoodAnalyzer() throws Exception
    {
    	String mood=moodanalyzer.analyseMood("I am in Sad Mood");
        assertEquals("SAD",mood);
    }
}
