
public class HasARelationship {

	public static void main(String[] args) {
		Teacher teach= new Teacher();
		teach.teaching();
	}

}
class Knowledge{
	void giving()
	{
		System.out.println("Teacher is Giving Knowledge and wisdom....");
	}
	
}

class Personn
{
	void SuccessfulPerson()
	{
		System.out.println("Teacher is producing Successful Person");
	}
	
	
}

class Teacher extends Personn{
	void teaching()
	{
		System.out.println("Teacher is Teaching......");
		Knowledge vidya= new Knowledge();
		vidya.giving();
		System.out.println("Students are taking Knowledge from the Teacher");
		SuccessfulPerson();
	}
	
	
}