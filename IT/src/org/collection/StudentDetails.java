package org.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentDetails {

		
		public static void main (String [] args){
			
			StudentData Anitha = new StudentData();
			Anitha.setRollno(1);
			Anitha.setName("Anitha");
			Anitha.setEmail("Anitha01@gmail.com");
			Anitha.setStd(6);
			Anitha.setPhone(8461644987l);
			
			StudentData Bala = new StudentData();
			Bala.setRollno(2);
			Bala.setName("Bala");
			Bala.setEmail("Bala02@gmail.com");
			Bala.setStd(7);
			Bala.setPhone(8461644981l);
			
			StudentData Dinesh = new StudentData();
			 Dinesh.setRollno(3);
			 Dinesh.setName("Dinesh");
			 Dinesh.setEmail("Dinesh03@gmail.com");
			 Dinesh.setStd(8);
			 Dinesh.setPhone(8461644982l);
			 
			 StudentData Priya = new StudentData();
			 Priya.setRollno(4);
			 Priya.setName("Priya");
			 Priya.setEmail("Priya04@gmail.com");
			 Priya.setStd(9);
			 Priya.setPhone(8461644983l);
			 
			
			
			System.out.println("user defined Map");
			
			Map<Integer,StudentData> D =  new LinkedHashMap<>();
			
			D.put(1,Anitha);
			D.put(2,Bala );
			D.put(3,Dinesh);
			D.put(4,Priya);


			Set<Entry<Integer, StudentData>> entrySet   = D.entrySet();
			for(Entry<Integer, StudentData> object : entrySet){
				
		    System.out.println((Integer)object.getKey()+"   "+(StudentData)object.getValue());
			}	
		}

	}



