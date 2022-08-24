package org.Programs;

public class Arrayprograms {
	
	public static void main (String [] args){
		
	
		
		//ascending order
		int a[] = {8,3,5,4,7};
		
		int temp;
		
		for(int i =0; i<a.length; i++){ //8
			
			for(int j =i+1; j<a.length; j++ ) { //3,4,5,7
				
				if(a[i]>a[j]) { //a[0]=8, a[1]=3	|8>3
					
					temp = a[j];	//temp = 3
					a[j] = a[i];	//a[j] =8
					a[i] = temp;	//a[i] =3
					
					
				} 
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); 
			
		}
		
		
		
	}
	
	
	
	
	
	

}
