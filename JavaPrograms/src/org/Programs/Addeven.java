package org.Programs;

public class Addeven {
	
	public static void main(String [] args){
		int count = 0;
		int ocount = 0;
		int sum1 = 0;
		int osum = 0;
		
		
	for(int i = 1; i <= 100; i++){
			
			
		if(i%2 == 0){
			
			System.out.println(i+" :even");
			count++;
			sum1= sum1+i;
		}else{
			System.out.println(i+" :odd");
			ocount++;
			osum= osum+i;
		}
			
		}
		System.out.println(sum1);
		System.out.println(count);	
		System.out.println(ocount);
		System.out.println(osum);
	}

}
