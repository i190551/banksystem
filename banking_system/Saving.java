package banking_system;



import java.util.Scanner;

public class Saving extends Account{
	

	int i=0,j=0;
	String ownername1;
	String acc_num1;
	String cni1,phone1,ad1;
	
	 double balance1,wdr1,dpt1,dispamount1;
	


	Saving()
	{
		acc_num1 = "";
		balance1 = 0;
		wdr1 = 0;
		dpt1=0;
		

	}

	

	

	
	void login()
	{
		
		Scanner sv= new Scanner(System.in);
		String ac_no1;

		System.out.println("Please Enter Account Number:");
		ac_no1=sv.nextLine();
		
		
		while(i<3)
		{
		
			if(ac_no1.equals(userac1[i]))
			{
				
				System.out.println("\nWelcome "+nameuser1[i]+"\n\nChoose one of any options:");
				ownername1=nameuser1[i];
				balance1=balanceac1[i];
				
				break;
			
			}
			
			
		i++;
		}
			
		if(i==3)
			{
				
				System.out.println("Sorry! You don't have any account in this bank. Sign up to make new Account");
				System.exit(0);
				
			
		
			}
			
			
		
		
	}

	void DepostMoney(double amount1) 
	{
		
		Deposit dp=new Deposit(balance1);
		if(tran_count<2)
		{
		dp.maketransaction(amount1);
		
		balanceac1[i]=balance1+amount1;
		
		dpt1=amount1;
		}
		else
		{
			
			dp.maketransaction(amount1);
			dpt1=amount1;
			balance1=balance1-10;
			
		}
		tran_count++;
		
		
		
		
	}


	void WithdrawMoney(double amount) {
		
		
		Withdrawal wd=new Withdrawal(balance1);
		
		if(tran_count<2) {
		wd.maketransaction(amount);
		wdr1=amount;
		}
		
		else
		{
			
			wd.maketransaction(amount);
			wdr1=amount;
			balance1=balance1-10;
		}
		
		tran_count++;
		
		
		
	}




	void calculateZakat()
	{
		
		if(balance1>=20000)
		{
			
			System.out.println("Total Zakat:"+balance1*(2.5)/100);
			 
			
		}
		else
		{
			System.out.println(0);
		}
		
	}

	void receipt()
	{


		System.out.println( "\nReceipt Statement:-\n----------JS BANK LIMITED----------\n");
		System.out.println( "Name:"+nameuser1[i] );
		System.out.println( "Account Number:" + userac1[i]);
		System.out.println( "Withdraw Amount:" + wdr1) ;
		System.out.println( "Deposited Amount:" + dpt1); 
		System.out.println("Available Balance:$" +(balance1+dpt1-wdr1));
		

		
		System.out.println( "Thanks "+nameuser1[i] );
		System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
		

	}
	
	double getInquireBalance()
	{
		
		balance1=dpt1+balance1-wdr1;
		return balance1;
	}

	
	void transfermoney(double money)
	{
		
		Scanner moneyt= new Scanner(System.in);
		
		System.out.println("Enter Account Number in which you want to transfer:");
		String ac_n=moneyt.nextLine();
		
		balance1=balance1-money;
		
		System.out.println("Money Transferred Successfully.\nRemaining Balance="+balance1);
		tran_count++;
		
	}
	
	void accountDetails()
	{
		
		System.out.println("Name: "+nameuser1[i]);

		System.out.println("Account Number: "+userac1[i]);

		System.out.println("Phone #: "+ph1[i]);

		System.out.println("CNIC: "+cnic1[i]);
		
		
		
	}
	
	

	void calculateInterest()
	{
		System.out.println("Total Interest: "+balance1*0.07);
	}


}
