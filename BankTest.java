
class Bank
{
	private int accNumber;
	private String	Name;
	private double Bal;

	void setAccount(int an,String nm,double bl)
	{
	System.out.println("Setting account.....");
	accNumber=an;
	Name=nm;
	Bal=bl;
	}

	void withdraw(int wdrawAm)
	  if(amountToWithdraw < accountBalance) {	{
	System.out.println("withdrawing amount :"+wdrawAm);
	accountBalance accountBalance -amounToWithdraw;
	
	}
   else{
	System.out.println("insufficient funds");
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
class BankTest
	{
	public static void main(String args[])
	{
	Bank bankObj1 = new Bank();
	Bank bankObj2 = new Bank();
	Bank bankObj3 = new Bank();

	bankObj1.showAcc();
	bankObj2.showAcc();
	bankObj3.showAcc();

	bankObj1.setAccount(1,"abc",56000);
	bankObj2.setAccount(2,"apurva",76000);
	bankObj3.setAccount(3,"shivali",56890);

	bankObj1.showAcc();
	bankObj2.showAcc();
	bankObj3.showAcc();

	bankObj1.withdraw(7000);
	bankObj2.withdraw(6000);
	bankObj3.withdraw(5000);

	bankObj1.showAcc();
	bankObj2.showAcc();
	bankObj3.showAcc();

	bankObj1.Deposit(2000);
	bankObj2.Deposit(6000);
	bankObj3.Deposit(1000);

	bankObj1.showAcc();
	bankObj2.showAcc();
	bankObj3.showAcc();
	}
}
