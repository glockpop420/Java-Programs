import java.util.*;
class Retire extends Personal
{
    int yrs;
    double pf;
    double grat;
    Retire(String n,String p,double b,int a,int y)
    {
        super (n,p,b,a);
        yrs=y;
        pf=0.0;
        grat=0.0;
    }
    void provident()
    {
        pf=0.02*basic_pay*yrs;
    }
    void gratuity()
    {
        if (yrs>=10)
        {
            grat=basic_pay*12;
        }
        else
        {
            grat=0.0;
        }
    }
    void display()
    {
        super.display();
        System.out.println("Years of service of the employee:" + yrs);
        System.out.println("Provident of the employee:" + pf);
        System.out.println("Gratuity of the employee:" + grat);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the employee");
        String name1=sc.nextLine();
        System.out.println("Enter PAN of the emplyoyee");
        String pan1=sc.nextLine();
        System.out.println("Enter basic pay of the employee");
        double basic_pay1=sc.nextDouble();
        System.out.println("Enter account number of the employee");
        int acc_no1=sc.nextInt();
        System.out.println("Enter years of service of the employee");
        int yrs1=sc.nextInt();
        Retire obj=new Retire(name1,pan1,basic_pay1,acc_no1,yrs1);
        obj.provident();
        obj.gratuity();
        obj.display();
    }
}
        
      