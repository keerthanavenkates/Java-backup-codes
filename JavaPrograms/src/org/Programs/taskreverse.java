package org.Programs;

public class taskreverse {
	
	public static void main(String [] args){
	
		String s ="Keerthana";
		
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--){
			
			rev = rev+s.charAt(i);	
			
		}
		String s2= rev.substring(0, 5);
		System.out.println(s2);

			
		}
		
		
		
	}


