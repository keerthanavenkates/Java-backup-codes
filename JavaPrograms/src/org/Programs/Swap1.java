package org.Programs;

public class Swap1 {
	
public static void main(String [] args){
		
		int a = 10;
		int b = 20;
		
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("After Swapping without third variable");
		
		a = a + b; //a=30, b=20
		b = a - b;	//a=30, b=10
		a = a - b; //a=20, 	b=10
		
		System.out.println(a);
		System.out.println(b);
			
		
	}

}
