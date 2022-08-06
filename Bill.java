import java.util.*;
class Bill extends Detail
{
    int n;
    double amt;
    
    Bill (String name,String address,long telno,double rent,int n)
    {
        super(name ,address,telno,rent);
        this.n=n;
        amt=0.0;
    }
    
    void cal()
    {
        if (n<=100)
        {
            System.out.println("Amount to be paid:" + amt);
        }
        else if (n>=101 && n<=200)
        {
            amt=rent+(0.6*n);
            System.out.println("Amount to be paid:" + amt);
        }
        else if (n>=201 && n<=300)
        {
            amt=rent+(0.8*n);
            System.out.println("Amount to be paid:" + amt);
        }
        else if (n>=301)
        {
            amt=rent+(1*n);
            System.out.println("Amount to be paid:" + amt);
        }
    }
    
    void show()
    {
        super.show();
        System.out.println("Number of calls:" + n);
        System.out.println("Amount to be paid:" + amt);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name1=sc.nextLine();
        System.out.println("Enter address");
        String add1=sc.nextLine();
        System.out.println("Enter telephone number:");
        long telno1=sc.nextLong();
        System.out.println("Enter monthly rental charges:");
        double rent1=sc.nextDouble();
        System.out.println("Enter number of calls");
        int noc1=sc.nextInt();
        
        Bill b=new Bill(name1,add1,telno1,rent1,noc1);
        b.cal();
        b.show();
    }
}