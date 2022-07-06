package org.collection;

import java.util.LinkedList;
import java.util.List;


public class Datas2 {
		
		public static void main(String [] args){
			
			
			
			List<Integer> A = new LinkedList<Integer>();
			// to store value in the list-------add()
			A.add(10);
			A.add(20);
			A.add(30);
			A.add(40);
			A.add(30);
			A.add(50);
			
			//to replace the value of particular index in set
			A.add(3, 35);
			System.out.println('A');
			
			//to know the total value stored in list-------size()
			for(int i = 0; i<A.size(); i++){
				
				System.out.println(A.get(i));		

			}
		}
			

}
