package com.slokam.treads;

public class MyCustomer {

	
	private long amount;
	

	public MyCustomer(long amount) {
		super();
		this.amount = amount;
	}
	
	
	public synchronized void withdraw(long amount) {
		
		
		System.out.println("Before withdraw amount is :: "+this.amount);
		
	     if(this.amount<amount) {
	    	 System.out.println("withdraw amount is :: "+amount);
	    	 try {
				wait();
				this.amount=this.amount-amount;
				System.out.println("Total amount is :: "+this.amount);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	     }
	}
	
	public synchronized void deposit(long amount) {
		
		System.out.println("Before deposit Balance amount is :: "+this.amount);
		
		System.out.println("deposit amount is :: "+amount);
		
		this.amount=this.amount+amount;
		
		System.out.println("Now total amount is :: "+this.amount);
		
		//notifyAll();
		notify();
	}
	
}









