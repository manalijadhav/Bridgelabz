public class OverloadingTest
{ 
	String accountName ;
int accountNumber;
int accountBalance;

int num=100;
	public static void main(String[] args) {
		OverloadingTest setacc = new OverloadingTest();
		setacc.setaccount("&ishi", -100, 10000);
		Branch obj= new Branch();
	
	}
 void setaccount(String accN,int accNo,int accB) {
	 char alpha=' ';
	 for(int i=0;i < accN.length();i++ )
	 {
		 alpha = accN.charAt(i);
		 if(alpha>=65&&alpha<=90 || alpha>=97&&alpha<=122)
		 {
		 accountName=accN;
		 }
		 else {
		 System.out.println("invalid account name");
		 }
	}
	 if(accNo>0)
	 {
		 accountNumber=accNo;}
	 else {
		 System.out.println("invalid number");}
	 }
 OverloadingTest()
 { 
	
	 
 }
}



 class Branch extends OverloadingTest
 {
	 Branch(int red)
	 { 
		 System.out.println(red);

	 }
	 Branch()
	 { 
		this(20);
	 }
	 public static void main(String[] args) {
		
	
		 Branch obj= new Branch();
	   }
 }

	 
	 
 
	

