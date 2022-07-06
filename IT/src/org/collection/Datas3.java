package org.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Datas3 {
	
	public static void main(String [] args){
		
		
		Set<Integer> C = new HashSet<Integer>();
		
		C.add(10);
		C.add(20);
		C.add(30);
		C.add(40);
		C.add(30);
		C.add(50);
		
		System.out.println('C');
		
       for(int i:C){
			
			System.out.println(i);		

		}
       Set<Integer> D = new TreeSet<Integer>();
       D.add(60);
	   D.add(70);
	   System.out.println('D');
       
	   for(int i:D){
				System.out.println(i);		

	   }
	   
	   D.addAll(C);
		System.out.println(" addition of C and D");
		for(int j:D){
			System.out.println(j);
	}
	
		D.equals(C);
		boolean a = D.equals(C);
		System.out.println(a);
		
		D.retainAll(C);
		System.out.println("After retain of C from D");
		for(int j:D){
			System.out.println(j);
		}
		D.removeAll(C);
		System.out.println("After removal of C from D");
		for(int j:D){
			System.out.println(j);
			
		}
	}

}
