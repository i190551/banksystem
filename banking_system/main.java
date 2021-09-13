package banking_system;


import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		String name,cnicc,cellnum,adr,act;int type;
		int choose;
		
		
		
		Scanner sc= new Scanner(System.in);
		Checking ac=new Checking();
		
		
		System.out.println("Welcome to JS Bank Limited\nChoose\n1.Open a new account \n2.Login\n3.Display Account Details and Bank Owner Details ");
		
		choose=sc.nextInt();
		
		
		switch (choose)
		{
		case 1:
			
			Scanner sd= new Scanner(System.in);
			System.out.println("Enter Full Name");
			name=sd.nextLine();
			
			System.out.println("Enter CNIC");
			cnicc=sd.nextLine();
			
			System.out.println("Enter Phone Number");
			cellnum=sd.nextLine();
			
			System.out.println("Enter Address");
			adr=sd.nextLine();
			
			System.out.println("Choose Account Type:\n1.Saving \n2.Checking\nChoose 1 or 2:");
			type=sd.nextInt();
			
			
			if(type==1)
			{
				
				ac.setopenaccount(name, cnicc, cellnum, adr,"Saving");
				
			}
			else if(type==2)
			{
				ac.setopenaccount(name, cnicc, cellnum, adr,"Checking");
			}
		
			ac.getaccount();
			
		
		
		break;
		
		case 2:
			
			System.out.println("1.Checking\n2.Saving");
			type=sc.nextInt();
			
		
			
			
		if(type==1)
		{
			ac.login();
		
		while(true)
		{
			System.out.println("1.Deposit Amount\n2.Withdraw Amount\n3.Check Balance\n4.Zakat\n5.Transfer Money\n6.Detail of Your Account\n7.Detail of Bank\n8.Exit\nChoose:");
		
		int opt=sc.nextInt();
		
		switch (opt) 
		{
		case 1:
		
			System.out.println( "\nHow much amount you want to Deposit:Rs");
			double depamount= sc.nextDouble();
		
	
		ac.DepostMoney(depamount);
	
		break;
		
		case 2:
		System.out.println( "How much amount do you want to Withdraw?Rs");
		
		 double witamount = 0;
					
		 witamount=sc.nextDouble();
		while(witamount>5000)
		{
			System.out.println("Cannot Withdraw more than Rs 5000. Try Again\nHow much amount do you want to Withdraw: ");
			witamount=sc.nextDouble();
		}
	
			ac.WithdrawMoney(witamount);
		
			break;
		case 3:
		System.out.println("Total Balance Available in your account is Rs"+ ac.getInquireBalance()) ;
			break;
		case 4:
			ac.calculateZakat();
			break;
		case 5:
			
			System.out.println("Enter amount you want to Transfer: Rs");
			double trans_amount=sc.nextDouble();
			ac.transfermoney(trans_amount);
			break;
		case 6:
			ac.accountDetails();
			break;
		case 7:
			ac.Details();

		
			break;
		case 8:
			System.exit(0);
			
			default:
				System.out.println("Invalid Input");
		
		}
			ac.receipt();
			}

		}

		else if(type==2)
		{
			Saving sav=new Saving();

			sav.login();
		
		while(true)
		{
			System.out.println("\n1.Deposit Amount\n2.Withdraw Amount\n3.Check Balance\n4.Zakat\n5.Transfer Money\n6.Detail of your Account \n7.Calculate Interest\n8.Detail of Bank\n9.Exit\nChoose:");
		
		int opt=sc.nextInt();
		
		switch (opt) 
		{
		case 1:
		
			System.out.println( "\nHow much amount you want to Deposit:Rs");
			double depamount= sc.nextDouble();
		
	
		sav.DepostMoney(depamount);
	
		break;
		
		case 2:
		System.out.println( "How much amount do you want to Withdraw?");
		
		 double witamount = 0;
					
		 witamount=sc.nextDouble();
		
	
			sav.WithdrawMoney(witamount);
		
			break;
		case 3:
		System.out.println("Total Balance Available in your account is Rs"+ sav.getInquireBalance()) ;
			break;
		case 4:
			sav.calculateZakat();
			break;
		case 5:
			
			System.out.println("Enter amount you want to Transfer: Rs");
			double trans_amount=sc.nextDouble();
			sav.transfermoney(trans_amount);
			break;
		case 6:
			sav.accountDetails();
			break;
		case 7:
			sav.calculateInterest();
			break;
		case 8:
			sav.Details();
			
			break;
		case 9:
			System.exit(0);
			
			default:
				System.out.println("Invalid Input");
		
		}
			sav.receipt();
			}

			
			
			
			
		}
		break;
		case 3:
			ac.Details();
			break;
			default:
				System.out.println("Invalid Input");
				System.exit(0);
	}	
		
	}


	}


