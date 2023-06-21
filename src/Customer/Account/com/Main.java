package Customer.Account.com;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(100, "THAT", 'M');
//        System.out.println(c.getId());
//        System.out.println(c.getName());
//        System.out.println(c.getGender());
//        System.out.println(c.toString());
       Account account=new Account(2,c,20.0);
       System.out.println(account.getCustomer());
        System.out.println(account.toString());
        account.deposit(-15);
        System.out.println(account.toString());
        account.withdraw(5);
        System.out.println(account.toString());
       Account A1=new Account(50  ,c);
      A1.setBalance(50);
        System.out.println(A1.getCustomerName());
    }

}
