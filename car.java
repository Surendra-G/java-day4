package tutorialweek04;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cardata c1 = new cardata();
		cardata c2 = new cardata("Black","BMW",100000);
		cardata.cardemo();
//		c1.name = "MerceFast";
//		c1.brand = "MercedesBenz";
//		c1.price = 10000000;
//		c1.printdetail();
	}

}
class cardata{
	String name;
	String brand;
	int price;
//	void printdetail() {
//		System.out.println("Name: "+name); 
//		System.out.println("Brand: "+brand);
//		System.out.println("Price: "+price);
//	}
	cardata(){
		System.out.println("The Details of Cars: ");
	}
	cardata(String n,String b, int p){
		System.out.println("Name: "+n);
		System.out.println("Brand: "+b);
		System.out.println("Price: "+p);
	}
	static void cardemo() {
		System.out.println("The End");
	}
}

