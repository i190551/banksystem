package banking_system;



public class Deposit extends Transaction {
	Deposit(double bal)
	{
		balance = bal;
	}


	void maketransaction(double amount)
	{

		balance = balance + amount;
		
	
	}


}