import java.util.*;
class Personal
{
    String name;
    String pan;
    double basic_pay;
    int acc_no;
    Personal(String n,String p,double b,int a)
    {
        name=n;
        pan=p;
        basic_pay=b;
        acc_no=a;
    }
    void display()
    {
        System.out.println("Name of the employee:" + name);
        System.out.println("PAN of the employee:" + pan);
        System.out.println("Basic pay of the employee:" + basic_pay);
        System.out.println("Account number of the employee:" + acc_no);
    }
}