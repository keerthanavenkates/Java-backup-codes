package org.Programs1;

import java.util.HashMap;
import java.util.Map;

public class Wordcount {
	
	public static void main(String [] args){
		
		String org = "Welcome to java class to chennai";
		
		String [] words = org.split(" ");
		
		Map<String,Integer> m = new HashMap<>();
		
		for(String word : words){
			if(m.containsKey(word)){
				Integer i = m.get(word);
				m.put(word, i+1);
				
			}else{
				m.put(word, 1);
			}
		}
		System.out.println(m);
		
}
}