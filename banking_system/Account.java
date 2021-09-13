package banking_system;




public class Account {
	int tran_count=0;

	String[] nameuser= {"Usama Khan","Noor Usama","Ali Ahmed"};
	String[] userac= {"001122","001123","001124"};
	String[] cnic= {"37405124586-5","37458625878-4","75482214556-8"};
	String[] ph= {"03025135458","03215468548","03005564482"};
	double[] balanceac= {120000,52000,15000};
	
	
	String[] nameuser1= {"Faizan Zahid","Ahmed Khan","Mehran Ahmed"};
	String[] userac1= {"002211","002212","002213"};
	String[] cnic1= {"374545850525-5","375868540258-9","605785166856-2"};
	String[] ph1= {"0300512335278","03354548268","030556633802"};
	double[] balanceac1= {50000,90000,150000};
	
	
	
	void Details()
	{
		System.out.println("Details\nBank Owner Details\nName: Aliyan Khan\nContact Number:030356265482\nAddress:Bahria Phase 9 Islamabad");
		System.out.println("Rank=CEO");
		
		System.out.println("\n\nAccount Details:");
		System.out.println("Checking Accounts:");
		int k=0;
		while(k<3)
		{
			System.out.println("\nName: "+nameuser[k]);
			System.out.println("Account Number: "+userac[k]);
			System.out.println("CNIC: "+cnic[k]);
			System.out.println("Phone Number: "+ph[k]);
			System.out.println("Balance: "+balanceac[k]);
			
			k++;
		}
		
		
		System.out.println("\n\nSaving Accounts:");
		k=0;
		while(k<3)
		{
			System.out.println("\nName: "+nameuser1[k]);
			System.out.println("Account Number: "+userac1[k]);
			System.out.println("CNIC: "+cnic1[k]);
			System.out.println("Phone Number: "+ph1[k]);
			System.out.println("Balance:Rs "+balanceac1[k]);
			
			k++;
		}
	
	}

}

