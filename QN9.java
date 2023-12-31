package tutorialweek04;

public class QN9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad = new Address();
		
		ad.setstreet("freedom");
		ad.setcity("New York");
		ad.setzipcode(4552.36);
		
		System.out.println("NAme of the Street is: "+ad.getstreet());
		System.out.println("Name of the city: "+ad.getcity());
		System.out.println("Zipcode = "+ad.getzipcode());
	}

}
class Address{
	private String street;
	private String city;
	private double zipcode;
	
	
	// get method
	String getstreet() {
		return street;
	}
	String getcity() {
		return city;
	}
	double getzipcode() {
		return zipcode;
	}
	
	//set method
	void setstreet(String street) {
		this.street = street;
//		System.out.println("Name of the STreet is: "+street);
	}
	void setcity(String city) {
		this.city = city;
//		System.out.println("Name of the City is: "+city);
	}
	
	void setzipcode(double zipcode) {
		this.zipcode = zipcode;
//		System.out.println("Zipcode is: "+zipcode);
	}
}