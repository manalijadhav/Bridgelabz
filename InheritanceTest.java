
class Tiger { }

public class InheritanceTest {
	public static void main(String[] args) {
		//SavingsAccount sa = new SavingsAccount(101,"Suresh", 50000, 4.5f);
		//sa.showBankAccount();
		/*Doctor d1 = new Doctor();
		Surgeon s1 = new Surgeon();
		HeartSurgeon hs1 = new HeartSurgeon();
		
		d1.diagnose();// s.Doctor.diagnose();
		s1.diagnose(); // s.Surgeon.diagnose();
		hs1.diagnose(); //// s.HeartSurgeon.diagnose();
		System.out.println("---------------------------");*/
		//s.diagnose();
	//	s.doSurgery(); // s.Surgeon.doSurgery()
		
		//hs.diagnose();
		//hs.doSurgery();
		//hs.doHeartSurgery();
		
		//2nd run
		Doctor d= new Doctor();
		Surgeon s = new Surgeon();
		HeartSurgeon hs = new HeartSurgeon();
		
		
		d.diagnose(); // early binding  d.Doctor.diagnose
		System.out.println("---");
		s.diagnose(); // early binding  s.Surgeon.diagnose
		s.doSurgery();
		System.out.println("---");
		hs.diagnose();// early binding  hs.HeartSurgeon.diagnose
		hs.doSurgery();
		hs.doHeartSurgery();
		
		System.out.println("-----------------------------");
		
		Doctor ref = new Doctor();
		// a super class handle/reference can invoke the 
		//overridden method of the child and not the exclusive one
		if(ref instanceof Doctor) {
			System.out.println("ref is pointing to Doctor..");
		} else {
			System.out.println("ref is NOT pointing to Doctor..");
		}
		ref.diagnose(); //ref.Doctor.diagnose();
		ref = new Surgeon();
		if(ref instanceof Surgeon) {
			System.out.println("NOW ref is pointing to Surgeon..");
		} else {
			System.out.println("ref is NOT pointing to Surgeon..");
		}
		ref.diagnose(); // 
	//	ref.doSurgery();
		ref = new HeartSurgeon();
		ref.diagnose(); //ref.Doctor.diagnose()
		
		if(ref instanceof HeartSurgeon) {
			System.out.println("NOW ref is pointing to HeartSurgeon..");
		} else {
			System.out.println("ref is NOT pointing to HeartSurgeon..");
		}
	
		
	}
}
class BankAccount // <-- blueprint of the object 
{
	//data members / fields
	private int accountNumber; 
	private String accountHolder; 
	private double accountBalance;

	BankAccount() { }
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

class SavingsAccount extends BankAccount
{
	private float interestRate;
	SavingsAccount(int a, String b, double c, float d) {
		super(a,b,c);
		interestRate = d;
	}
	//deposit and withdraw are inherited functions here
	
	//inherited function and then overridden token
	void showBankAccount() { //overriding - hiding the method of the parent
					//and providing your own contract*
		super.showBankAccount(); // super class contract
		System.out.println("Intereset rate  : " + interestRate); //*
	}
	
	void calculateSimpleInterest() { //exclusive function
		
	}
}

// exclusive
// inherited
// inherited -> overridden
// implemented
class Doctor
{
	void diagnose() //exclusive - overridden
	{
		System.out.println("Doctor is diagnosing......ENT...");
	}
}
class Surgeon extends Doctor
{
	void diagnose() { // overridding 
		System.out.println("Surgeon is diagnosing...ENT+ BloodPresure + ECG ...");
	}
	void doSurgery() //exclusive
	{
		System.out.println("Surgeon doing surgery...");
	}
}

class HeartSurgeon extends Surgeon
{
	void diagnose() { //inherited from the nearest parent and then overridden
		//super.diagnose();
		System.out.println("HeartSurgeon is diagnosing...how you walked in here..ECG..CT...MRI...");
	}
	void doSurgery() //inherited from the nearest parent and then overridden
	{
		//super.doSurgery();	
		System.out.println("HeartSurgeon doing surgery...");
	}
	void doHeartSurgery() //exclusive
	{
		System.out.println("HeartSurgeon doing heart surgery...");
	}
}
