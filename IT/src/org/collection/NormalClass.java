package org.collection;

public class NormalClass extends PartialClass{
	
	
	@Override
	public void currentAccount() {
		System.out.println("loan rate account is 10 %");
	}

	@Override
	public void savingsAccount() {

		System.out.println("Savings rate account is 30 %");
	
	}
		
	
	
	
	public static void main(String [] args){
		NormalClass n = new NormalClass();
		n.currentAccount();
		n.savingsAccount();
		n.loanAccount();
	
	
	
	}

	
		
	}
	
	

