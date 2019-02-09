class Bank
{
	int accNumber;
	String	Name;
	double Bal;

	void setAccount(int an,String nm,double bl)
	{
	System.out.println("Setting account.....");
	accNumber=an;
	Name=nm;
	Bal=bl;
	}

	void withdraw(int wdrawAm)
	{
	System.out.println("withdrawing amount :"+wdrawAm);
	Bal=Bal-wdrawAm;
	}

	void Deposit(int depo)
	{
	System.out.println("Depositing amount :"+depo);
	Bal=Bal+depo;
	}

	void showAcc()
	{
	System.out.println("Account Number:		"+accNumber);
	System.out.println("Account Holder Name:	"+Name);
	System.out.println("Account Balance		"+Bal);
	System.out.println("------------------------------------------------");
	}

	public static void main(String args[])
	{
	Bank bankObj = new Bank();
	bankObj.showAcc();
	bankObj.setAccount(1,"abc",56000);
	bankObj.showAcc();
	bankObj.withdraw(5000);
	bankObj.showAcc();
	bankObj.Deposit(2000);
	bankObj.showAcc();
	}
}