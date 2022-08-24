package org.Programs1;

public class Palindrome {
	
	public static void main(String [] args){
		
		int count = 0;
		for (int i = 10; i<=1000;i++){
			
		int n = i;
		int j=0;
		
		while(n>0){
							//i=10	i=11	i=12 i=13 i=14i=15i=16i=17i=18i=19i=20i=21i=22
				int a = n%10; //a=0 // a=1 //a=2	3	4	5				9	0	1	2
				j=(j*10)+a;   //j=0 //j=1  //2		3	4	5				9	0	1	2
				n  =n/10;    // n=1 //n=1  //1		2	1	1				1	2
		}
		
		if (j==i){
			System.out.println("Palindrome number is :" +i);
			count++;
		
		}
		}
		
		System.out.println(count);
	}
}