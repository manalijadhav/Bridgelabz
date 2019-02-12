
public class BankTest {

//	public static void main(String[] args) {
//		
//System.out.println("Hello world from java programming");
//	}


	public static void main(String args[])
	{
		System.out.println("starting the bank....");
		
		BankAccount bankObj1 = new BankAccount();
		BankAccount bankObj2 = new BankAccount();
		BankAccount bankObj3 = new BankAccount();

		System.out.println("---------------------------------------");

		bankObj1.showBankAccount();
		bankObj2.showBankAccount();
		bankObj3.showBankAccount();


		bankObj1.setBankAccount(101,"Julie",50000);
		bankObj1.showBankAccount();
		System.out.println("---------------------------------------");
		bankObj2.setBankAccount(102,"Robert",90000);
		bankObj2.showBankAccount();
		System.out.println("---------------------------------------");
		bankObj3.setBankAccount(103,"Rosa",120000);
		bankObj3.showBankAccount();
		System.out.println("---------------------------------------");

		bankObj1.withdraw(6000);
		bankObj1.showBankAccount();
		bankObj2.withdraw(7000);
		bankObj2.showBankAccount();
		bankObj3.withdraw(8000);
		bankObj3.showBankAccount();


		bankObj1.deposit(4000);
		bankObj1.showBankAccount();
		bankObj2.deposit(5000);
		bankObj2.showBankAccount();
		bankObj3.deposit(6000);
		bankObj3.showBankAccount();
	}
}
// business entity
class BankAccount
{
	private int accountNumber; 
	private String accountHolder; 
	private double accountBalance;

	void withdraw(double amountToWithdraw)	{
		System.out.println("Withdrawing......"+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("---------------------------------------");
	}
	void deposit(double amountToDeposit) 
	{
		//if(amountTo
		
		System.out.println("Depositing......"+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		System.out.println("---------------------------------------");
	}
	void setBankAccount(int acno, String achn, double accBal)
	 {
		System.out.println("Setting BankAccount....");
		accountNumber = acno;	accountHolder = achn;
		accountBalance = accBal;
	}
	void showBankAccount() 
	{
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
	}
}
