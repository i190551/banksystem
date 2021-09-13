package banking_system;


import java.util.Random;
import java.util.Scanner;

public class Checking extends Account {
	int i=0,j=0;
	String ownername;
	String acc_num;
	String cni,phone,ad,typeac;
	
	 double balance,wdr,dpt,dispamount;
	


	Checking()
	{
		acc_num = "";
		balance = 0;
		wdr = 0;
		dpt=0;
		typeac="";

	}

	

	
	void setopenaccount(String fullname,String cnic,String cell,String address,String typeof)
	{
		ownername=fullname;
		cni=cnic;
		phone=cell;
		ad=address;
		typeac=typeof;
		
	}
	
	void getaccount()
	{
		Random rand = new Random();
		int rand2 = rand.nextInt(100000);
		System.out.println("Thankyou for Creating Account with Us. Your Account Number is "+rand2);
		System.out.println("Name: "+ownername);
		System.out.println("CNIC: "+cni);
		System.out.println("Phone: "+phone);
		System.out.println("Address: "+ad);
		System.out.println("Account Type: "+typeac);
		
	}
	
	
	void login()
	{
		
		Scanner st= new Scanner(System.in);
		String ac_no;

		System.out.println("Please Enter Account Number:");
		ac_no=st.nextLine();
		
		
		while(i<3)
		{
		
			if(ac_no.equals(userac[i]))
			{
				
				System.out.println("\nWelcome "+nameuser[i]+"\n\nChoose one of any options:");
				ownername=nameuser[i];
				balance=balanceac[i];
				
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

	void DepostMoney(double amount) 
	{
		
		Deposit dp=new Deposit(balance);
		if(tran_count<2)
		{
		dp.maketransaction(amount);
		
		balanceac[i]=balance+amount;
		
		dpt=amount;
		}
		else
		{
			
			dp.maketransaction(amount);
			dpt=amount;
			balance=balance-10;
			
		}
		tran_count++;
		
		
		
		
	}


	void WithdrawMoney(double amount) {
		
		
		Withdrawal wd=new Withdrawal(balance);
		
		
		
		
		if(tran_count<2) {
			
		wd.maketransaction(amount);
		wdr=amount;
		}
		
		else
		{
			
			wd.maketransaction(amount);
			wdr=amount;
			balance=balance-10;
		}
		
		tran_count++;
		
		
		
	}




	void calculateZakat()
	{
		
		if(balance>=20000)
		{
			
			System.out.println(balance*(2.5)/100);
			 
			
		}
		else
		{
			System.out.println(0);
		}
		
	}

	void receipt()
	{


		System.out.println( "\nReceipt Statement:-\n----------JS BANK LIMITED----------\n");
		System.out.println( "Name:"+nameuser[i] );
		System.out.println( "Account Number:" + userac[i]);
		System.out.println( "Withdraw Amount:" + wdr) ;
		System.out.println( "Deposited Amount:" + dpt); 
		System.out.println("Available Balance:$" +(balance+dpt-wdr));
		

		
		System.out.println( "Thanks "+nameuser[i] );
		System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
		

	}
	
	double getInquireBalance()
	{
		
		balance=dpt+balance-wdr;
		return balance;
	}

	
	void transfermoney(double money)
	{
		
		Scanner moneyt= new Scanner(System.in);
		
		System.out.println("Enter Account Number in which you want to transfer:");
		String ac_n=moneyt.nextLine();
		
		balance=balance-money;
		
		System.out.println("Money Transferred Successfully.\nRemaining Balance="+balance);
		tran_count++;
		
	}
	
	void accountDetails()
	{
		
		System.out.println("Name: "+nameuser[i]);

		System.out.println("Account Number: "+userac[i]);

		System.out.println("Phone #: "+ph[i]);

		System.out.println("CNIC: "+cnic[i]);
		
		
		
	}
	

}

