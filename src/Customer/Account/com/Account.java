package Customer.Account.com;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + "customer=" + customer + "balance=" + balance + '}';
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println(" your amount is less than zero");
        return;
        }
        this.balance += amount;
        System.out.println("current amt =" + this.balance);
    }
    public void withdraw(double amount){
        if (amount<0 || amount>this.balance){
            System.out.println(" your input amount invalid");
        }
         this.balance=this.balance-amount;
        System.out.println("current amt ="+this.balance);
    }
}