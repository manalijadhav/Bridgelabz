
public class Inheritance1 {

	public static void main(String[] args) {
		
		Doctor docbj1 =  new  Doctor();
		
	}
				
		
		

	}
	
	class Doctor {
		
		void diagnose() {
			
			System.out.println("Doctor is diagnosing...");
		}
		
	}
	
	class Surgeon extends Doctor{
		
		void diagnose() {
			
			System.out.println("Surgeon is diagnosing....");
		}
		
		void surgery() {
			
			System.out.println("Surgeon is performing surgery...");
		}
	}
	
	class HeartSurgeon extends Doctor{
		
void diagnose() {
			
			System.out.println("HeartSurgeon is diagnosing....");
		}
		
		void surgery() {
			
			System.out.println("HeartSurgeon is performing surgery...");
		}
		
		void HeartSurgery() {
			
			System.out.println("HeartSurgeon is performing heart surgery....");
		}
	}

}
