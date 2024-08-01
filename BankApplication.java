//Demonstration on bank application
package com.learn;
public class BankApplication {
	//variable declaration
	int accBalance;
	//method with parameter on throw block
	  void withdraw(int amt) throws InsufficientFundException {
		  if(accBalance<=1000)
		throw new InsufficientFundException("Insufficient Amount");
	  else {
		  accBalance-=amt;
		  System.out.println("Amount withdrawn Successfully");
	    }
	  }
	 
	  void CheckBalance() {
		  System.out.println("Account Balance="+accBalance);
	  }
	  void Deposit(int amt) {
		  accBalance+=amt;
		  System.out.println("Amount deposited successfully="+amt);
	  }
		  
	public static void main(String[] args) {
		//object
	BankApplication bk=new BankApplication();
	//calling methods
	bk.accBalance=2500;
	bk.CheckBalance();
	bk.Deposit(2000);
	
	}

}
