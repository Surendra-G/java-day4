package tutorialweek04;

public class Qn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount1 balc = new BankAccount1();
		
		balc.setbalance1(10000.22);
		System.out.println("The new balance is: "+balc.getbalance1());
	}

}
class BankAccount1{
	private double balance1;
	
	double getbalance1() {
		return balance1;
	}
	void setbalance1(double balance2) {
		this.balance1 = balance2;
	}
}