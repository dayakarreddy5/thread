package com.slokam.treads;



public class CustomerTest {

	
	public static void main(String[] args) {
		
	MyCustomer customer=new MyCustomer(1000);	
	
	 
	
	new Thread() {
		public void run() {
			customer.withdraw(1500);
		}
	}.start();
	
	new Thread() {
		public void run() {
			customer.deposit(1000);
		}
	}.start();
	
	
	
	
	}
}
