//Demonstration on interthread communication
package com.learn;
public class ATM { 
	public static void main(String[] args) {
		Transaction transaction =new Transaction(12321,30000);
		Thread t=new Thread() {
			public void run() {
				transaction.withdraw(50000);
			}
		};
		t.start();
		Thread t1=new Thread() {
			public void run() {
				transaction.deposit(40000);
			}
		};
  t1.start();
	}

}
