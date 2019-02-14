class BankTest
{  	//		who
	//where		when
	//why   what    wow
	
	public static void main(String args[])
	{
		System.out.println("starting the bank....");

		//creating object = instantiation process
		BankAccount bankObj1 = new BankAccount(-100,"Sachin",50000);
		bankObj1.showBankAccount();
		
		bankObj1.withdraw(7000);
		bankObj1.showBankAccount();
		
		//bankObj1.BankAccount(122,"Julie",6000);
	//	bankObj1.showBankAccount();
		
		
	}
}
// business entity  

//vision

class A
{
	int x,y,z;
	//here JPL provides a ctor known as implicit or default ctor
	//it does nothing
}
// A a = new A();

class B
{
	int light;
	
	B(int x) // this is explicit no-arg ctor -NEVER KNOWN AS DEFAULT 
	{
		int planet;
	    System.out.println("light is "+light);	
	    //System.out.println("planet is "+planet);
	}
	void fun() {
		light =29292;
	}
}

class NegativeAccountNumberException extends Exception
{
	
}

class BankAccount // <-- blueprint of the object 
{
	//data members / fields
	private int accountNumber; 
	private String accountHolder; 
	private double accountBalance;

	BankAccount() { }
	
							//local variables
	BankAccount( String achn) {
		this(0,achn,0); // call the constructor of the same class
		System.out.println("==>Creating and setting the BankAccount(String)....");
		//accountHolder = achn;
		
		
	}
	
	BankAccount(int accountNumber, String achn, double accBal) {
		System.out.println("==>Creating and setting the BankAccount(int,String,double)....");
		if(accountNumber < 0 ) {
			System.out.println("account number cannot be negative..");
		}
		else {
			this.accountNumber = accountNumber;	
		}
		//all local variables must be initialized
		
		boolean validName= false; // 
		char alpha =' ';
		for (int i=0;i<achn.length();i++)
		{  //Sac%4in
			alpha = achn.charAt(i);
			if( (alpha >=65 && alpha <=90) || ( alpha >=97 && alpha <=122) || (alpha==32) ) // notepad -> alt+68
			{
				validName = true;
			}
			else {
				validName = false;
				break;
			}
		}
		
			if(validName == true) {
				accountHolder = achn;		
			}
			else {
				System.out.println("Invalid account holder name ");
			}
		
		if(accBal < 0) {
			System.out.println("Account opening balance cannot be negative...");
		}
		else {
			accountBalance = accBal;
		}
	}
	
	/*void setBankAccount(int acno, String achn, double accBal) {
		System.out.println("==> Setting the BankAccount....");
		accountNumber = acno;	accountHolder = achn;
		accountBalance = accBal;
	}*/
	//member functions / methods

		void withdraw(double amountToWithdraw)	{
		if(amountToWithdraw < accountBalance) 	{
			System.out.println("--> Withdrawing......"+amountToWithdraw);
			accountBalance = accountBalance - amountToWithdraw;
		}
		else {
			System.out.println("Insufficient funds..cannot withdraw....");
		}
	}
	void deposit(double amountToDeposit) {
		if(amountToDeposit < 0 ) {
			System.out.println("Cannot deposit negative amount...");
		}
		else {
			System.out.println("<-- Depositing......"+amountToDeposit);
			accountBalance = accountBalance + amountToDeposit;
		}
	}
	

	void showBankAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("----------------------------");
	}
}
