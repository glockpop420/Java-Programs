import java.util.*;
class Compute extends Library
{
    int d;
    double f;
    Compute(String n,String a,double p1,int d1)
    {
        super (n,a,p1);
        d=d1;
        f=0.0;
    }
    void fine()
    {
        if (d>=1 && d<=5)
        {
            f=f+2;
        }
        else if (d>=6 && d<=10)
        {
            f=f+3;
        }
        else if(d>10)
        {
            f=f+5;
        }
        else
        {
            f=0;
        }
    }
    void show()
    {
        super.show();
        System.out.println("Number of days:" + d);
        System.out.println("Fine to be paid:" + f);
        System.out.println("Total amount:" + (p*0.02*d));
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the book");
        String name1=sc.nextLine();
        System.out.println("Enter author of the book");
        String author1=sc.nextLine();
        System.out.println("Enter amount of the book");
        double p2=sc.nextDouble();
        System.out.println("Enter number of days");
        int d2=sc.nextInt();
        Compute obj=new Compute(name1,author1,p2,d2);
        obj.fine();
        obj.show();
    }
}
        