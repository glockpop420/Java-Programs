import java.util.*;
class Sales extends Product
{
    int day;
    double tax;
    double totamt;
    Sales (String n, int c, double p, int d)
    {
        super (n,c,p);
        day=d;
        tax=0.0;
        totamt=0.0; 
    }
    void compute()
    { 
        if(day>30)
        {
            tax=((12.4/100)*amount)+((2.5/100)*amount);
            totamt = amount+tax;
        }
        else
        {
            tax=((12.4/100)*amount);
            totamt =amount+tax;  
        }
    }
    void show()
    {
        super.show();
        System.out.println("Total amount" + totamt);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the product");
        String name1=sc.nextLine();
        System.out.println("Enter code of the product");
        int code1=sc.nextInt();
        System.out.println("Enter amount of the product");
        double amount1=sc.nextDouble();
        System.out.println("Enter number of days");
        int day1=sc.nextInt();
        Sales obj=new Sales(name1,code1,amount1,day1);
        obj.compute();
        obj.show();
    }
}
        
         
    