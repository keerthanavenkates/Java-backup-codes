package org.Programs;

public class ArrayDescending {
	public static void main (String [] args){
	//decending order
	int a[] = {8,3,5,4,7};
	
	int temp;
	
	for(int i =0; i<a.length; i++){ //8
		
		for(int j =i+1; j<a.length; j++ ) { //3,4,5,7
			if(a[i]<a[j])
			 { //a[0]=8, a[1]=3	|8>3
				
				temp = a[i];	//temp = 3
				a[i] = a[j];	//a[j] =8
				a[j] = temp;	//a[i] =3
				
				
			} 
		}
		
	}
	System.out.println("Descending order"); 
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]); 	
		
	}
	System.out.println("Largest number:" +a[0]); 	
	//If it is ascending order we print
	//(System.out.println("Largest number:" +a[a.length-1]);
	
	
}


}


