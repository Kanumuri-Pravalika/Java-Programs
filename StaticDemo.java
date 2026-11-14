class Account {
    int custid;
    String custname;
    double balance;
    static double minBal = 2500.00;

    public Account(int x, String y, double z) {
        custid = x;
        custname = y;
        balance = z;
    }

    static void changeMinBalance(double x)
    {
        minBal += x;
    }

    void display() {
        System.out.println("customerId :" + custid);
        System.out.println("custName :" + custname);
        System.out.println("Balance Available :" + balance);
        System.out.println("Minimum Blance :" + minBal);
    }
}

public class StaticDemo
{
    public static void main(String[] args)
    {
        Account obj=new Account(12345,"ABCD",25000.00);
        System.out.println("Before Updating Minimum Balance ");
        obj.display();
        Account.changeMinBalance(500.00);
        System.out.println("After updating Minimum Balance");
        obj.display();
    }
}