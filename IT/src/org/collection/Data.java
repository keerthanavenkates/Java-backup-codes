package org.collection;


import java.util.ArrayList;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {
	
	public static void main(String [] args){
		
		WebDriverManager.chromedriver().setup();
		List<Integer> A = new ArrayList<Integer>();
		
		// to store value in the list-------add()
		
		// generics ------- it restrict collection to similar data types from java 1.5 generics is followed
		
		
		A.add(10);
		A.add(20);
		A.add(30);
		A.add(40);
		A.add(30);
		A.add(50);
		System.out.println('A');
		
		//to know the total value stored in list-------size()
		for(int i = 0; i<A.size(); i++){
			
			System.out.println(A.get(i));		

		}
		
		List <Integer> B = new  ArrayList<Integer>();
		B.add(100);
		B.add(200);
		
		System.out.println("Before add A and B");
		System.out.println('B');
		for(int j = 0; j<B.size(); j++){
			System.out.println(B.get(j));	
			
		
		}	
		B.addAll(A);
		System.out.println("After addition of A and B");
		for(int j = 0; j<B.size(); j++){
			System.out.println(B.get(j));
			
			//to validate both list are equal-------equals() 
		}	
			B.equals(A);
			boolean a = B.equals(A);
			System.out.println(a);
			
			B.retainAll(A);
			System.out.println("After retain of A from B");
			for(int j = 0; j<B.size(); j++){
				System.out.println(B.get(j));
			}
			B.removeAll(A);
			System.out.println("After removal of A from B");
			for(int j = 0; j<B.size(); j++){
				System.out.println(B.get(j));
				
			}
			
			
}

}