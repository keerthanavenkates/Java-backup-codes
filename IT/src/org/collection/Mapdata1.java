package org.collection;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdata1 {
	
	
public static void main (String [] args){
	
	Map<String, Integer> A =  new LinkedHashMap<>();
	
	//to store the value in map--------put()
	
A.put("Keerthana", null);
A.put("Venkatesh", 103);
A.put("Dhanvika", 103);
A.put("Sekar", 103);


	
	

System.out.println("*********key and Values******");
// to iterate map------entryset()

Set<Entry<String, Integer>> entrySet   = A.entrySet();
for(Entry<String, Integer> entry : entrySet){
	
	System.out.println(entry.getKey()+"     "+entry.getValue());

}
	}

}



