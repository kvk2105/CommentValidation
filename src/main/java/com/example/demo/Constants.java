package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Constants {
	public static Set<String> OBJECTIONABLE_WORDS = Collections.unmodifiableSet(
	        new HashSet<String>(Arrays.asList(
	              "invalidWord1", 
	              "badWord2",
	              "unacceptedWord3",
	              "notGoodWord4"
	              )));
	
}
