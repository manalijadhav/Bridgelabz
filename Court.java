000
public class Court 
{

	public static void main(String[] args) 
	{
		//Judge j = new Judge();
		LawCollege lawColl = new LawCollege();
		Lawyer ref=lawColl.createLawyer();
		System.out.println("Lawyers are on the Field...!!!");
		
		CrimeLawyer crm = lawColl.createCrimeLawyer();
		System.out.println("CrimeLawyers are on the Feild...!!!");                    
	}

}
class Lawyer{}
class CrimeLawyer extends Lawyer{} // every CrimeLawyer is a Lawyer

class College { }
class LawCollege extends College // every LawCollege is a College
{
	Lawyer createLawyer() //lawcollege is producing Lawyers
	{
		System.out.println("Students Studying Law....");
		System.out.println("Lawyers are Being Produced");
		Lawyer llb= new Lawyer();
		System.out.println("Lawyer is Produced!!!");
		return llb;
	}
	CrimeLawyer createCrimeLawyer()
	{
		System.out.println("Lawyers Studying Crime Records...");
		System.out.println("Crime Lawyers are being Produced...");
		CrimeLawyer crm = new CrimeLawyer();
		System.out.println("Crime Lawyers is Produced");
		return crm;
	}
}
