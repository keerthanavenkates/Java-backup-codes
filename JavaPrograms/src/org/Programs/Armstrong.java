package org.Programs;

public class Armstrong {
	
	public static void main(String  [] args){
		int count = 0;
		for(int i =10; i<=1000; i++){
			
			
			int n = i;
			int j=0, a;
			while(n>0){
									  
					 a = n%10;   
					j= j +(a*a*a);
					n  =n/10;   	
			}
			
			if (j==i){
				System.out.println("Armstrong number is:" +i);
				count++;
			
			}
			}
			
			System.out.println(count);
		}
}
	


			
			
			
