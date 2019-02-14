
public class InterfaceTest {
	public static void main(String[] args) {
		//Flight flight = new Flight(101,"Jet Airways","Mumbai","London");
		//System.out.println("flight is : "+flight);
		
		CommercialFlight commFlight = new CommercialFlight(101,"Jet Airways","Mumbai","London",300,50000);
		commFlight.showCommercialFlight();
		//System.out.println("Comm Flight is : "+commFlight);
		commFlight.checkTickets();
		commFlight.issueBoardingPass();
		commFlight.fly();
		//commFlight.checkAltitude();
		//commFlight.checkLatitude();	
	}
}

abstract  class Flight //meant for inheritance
{
	private int flightNumber;
	private String flightName;
	private String sourceCity;
	private String destCity;
	
	abstract void fly() ;
	abstract void land();
	
	public Flight(int flightNumber, String flightName, String sourceCity, String destCity) {
		super();
		System.out.println("Flight(int,String,String,String");
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.sourceCity = sourceCity;
		this.destCity = destCity;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", sourceCity=" + sourceCity
				+ ", destCity=" + destCity + "]";
	}
	void showFlight() {
		System.out.println("Flight no	: "+flightNumber);
		System.out.println("FlightName	: "+flightName);
		System.out.println("Source		: "+sourceCity);
		System.out.println("Dest		: "+destCity);
	}
}

interface Airport
{
	void checkTickets(); // by default its public and abstract
	void issueBoardingPass(); // by default its public and abstract
	//int max=100; // by default public static and final
}

interface Aviation
{
	void checkLatitude(); //GPS
	void checkAltitude(); // vertical position
}

// comm flight -> 102 JetAir Mum Lon 300 50000 
class CommercialFlight extends Flight implements Airport, Aviation// isA
{
	int totalSeats;
	double farePerSeat;
	double totalCostOfFlight;
	
	CommercialFlight(int a,String airline, String sc,String dc, int ts, double fare) {
		super(a,airline,sc,dc);
		totalSeats = ts;
		farePerSeat = fare;
		totalCostOfFlight = totalSeats * farePerSeat ;  
		System.out.println("CommercialFlight(int,String,String,String,int,double)");
	}
	void showCommercialFlight() {
		super.showFlight();
		System.out.println("Total Seats	: "+totalSeats);
		System.out.println("Fare/Seat	: "+farePerSeat);
		System.out.println("Total Cost	: "+totalCostOfFlight);
	}
	public void checkTickets()
	{
		System.out.println("Checking...Tickets....");
	}
	public void issueBoardingPass() {
		System.out.println("Issuing boarding passes....");
	}
	@Override
	public void checkLatitude() {
		// TODO Auto-generated method stub
		System.out.println("Flight is checking its.... latitude...");
	}
	@Override
	public void checkAltitude() {
		// TODO Auto-generated method stub
		System.out.println("Flight is checking its.... altitude...");
	}
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flight is flying.....");
		 checkAltitude();
		 checkLatitude();
	}
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Flight is landing........");
	}
	
	
}
