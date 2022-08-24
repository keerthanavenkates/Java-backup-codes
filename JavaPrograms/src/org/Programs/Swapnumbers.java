package org.Programs;

public class Swapnumbers {
	
	public static void main(String [] args){
		
		int a = 10;
		int b = 20;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("After Swapping with third variable");
		
		c=a;// c= 10, a=10, b=20
		a=b;// c=10,  a=20, b=20
		b=c;//	c=10, a=20, b=10
		
		System.out.println(a);
		System.out.println(b);
			
		
	}

}
