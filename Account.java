import java.util.*;
class Account extends Bank
{
    double amt;
    Account(String n,int a,double p1,double am)
    {
        super (n,a,p1);
        amt=am;
    }
    void deposit()
    {
        p=p+amt;
    }
    void withdraw()
    {
        if (amt>p)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            p=p-amt;
        }
        if (p<100)
        {
            double f=(500-p)/10;
            p=p-f;
        }
    }
    void display()
    {
        super.display();
        System.out.println("Amount deposited or withdrawed:" + amt);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the customer:");
        String name1=sc.nextLine();
        System.out.println("Enter account number of the customer:");
        int accno1=sc.nextInt();
        System.out.println("Enter Principle number of the customer:");
        double p2=sc.nextDouble();
        System.out.println("Enter amount to be deposited(+) or withdrawed(-) by the customer:");
        double amt1=sc.nextDouble();
        Account obj=new Account(name1,accno1,p2,amt1);
        System.out.println("1.Deposit\n2.Withdraw\nEnter your option number");
        int c=sc.nextInt();
        if (c==1)
        {
            obj.deposit();
            obj.display();
        }
        else if (c==2)
        {
            obj.withdraw();
            obj.display();
        }
        else
        {
            System.out.println("Invalid option");
        }
    }
}
    
    
        