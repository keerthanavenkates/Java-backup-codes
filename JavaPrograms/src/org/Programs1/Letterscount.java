package org.Programs1;

import java.util.HashMap;
import java.util.Map;

public class Letterscount {
	
	public static void main (String [] args){
		
	
	String s = "Welcome to java ";
	
	char[] letters = s.toCharArray();

			
			Map<Character,Integer> n = new HashMap<>();
			
			for(char letter : letters){
				if(n.containsKey(letter)){
					Integer i = n.get(letter);
					n.put(letter, i+1);
					
				}else{
					n.put(letter, 1);
				}
			}
			System.out.println(n);
		}
		

	}
