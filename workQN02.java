package tutorialweek04;
import java.util.Scanner;
public class workQN02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		bankaccount s1 = new bankaccount();
		s1.accountNumber = 125487895;
		s1.balance = 1000000;
		s1.accountHolderName = "Surendra Giri";
		s1.accountHolderAddress = "Chandragiri-01";
		System.out.print("Enter the amount to deposit: ");
		int a = input.nextInt();
		System.out.print("Enter the amount to Withdraw: ");
		int b = input.nextInt();
		s1.depositMoney(a);
		s1.WithdrawMoney(b);
		s1.detail();
		
		input.close();
	}
}
//QN02
class bankaccount{
	int accountNumber;
	int balance;
	String accountHolderName;
	String accountHolderAddress;
	void detail() {
		System.out.println("AccountNumber: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("AccountHolderName: "+accountHolderName);
		System.out.println("AccountHolderAddress: "+accountHolderAddress);
	}
	void depositMoney(int a) {
		balance += a;
	}
	void WithdrawMoney(int b) {
		balance -= b;
	}*
}


//QN01
//class bankAccount{
//	int accountNumber;
//	int balance;
//	String accountHolderName;
//	String accountHolderAddress;
//	
//}
