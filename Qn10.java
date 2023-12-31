package tutorialweek04;

public class Qn10 {

    public static void main(String[] args) {
        Customer cus1 = new Customer();

        cus1.setCustomerid(555555);
        cus1.setName("Surendra");
        cus1.setBankAccount(54898);

        System.out.println("CustomerID: " + cus1.getCustomerid());
        System.out.println("Name: " + cus1.getName());
        System.out.println("BankAccount: " + cus1.getBankAccount());
    }
}

class Customer {
    private int customerid;
    private String name;
    private int bankAccount;

    Customer() {
        System.out.println("Bank Details:");
    }

    int getCustomerid() {
        return customerid;
    }

    String getName() {
        return name;
    }

    int getBankAccount() {
        return bankAccount;
    }

    void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }
}
