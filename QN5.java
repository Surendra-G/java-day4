package tutorialweek04;

public class QN5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a  = new BankAccount("Surendra",489561894,1200000);
	}

}
class BankAccount{
	String name;
	int account_number;
	int amount;
	BankAccount(String name,int account_number,int amount){
		this.name = name;
		this.account_number = account_number;
		this.amount = amount;
		System.out.println("Nama: "+name+"\nAccount Number: "+account_number+"\nAmount:"+amount);
	}
}
