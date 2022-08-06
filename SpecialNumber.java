import java.util.*;
class SpecialNumber
{
    int n;
    SpecialNumber()
    {
        n=0;
    }
    SpecialNumber(int s)
    {
        n=s;
    }
    void sum()
    {
        int m=1;
        for (int i=n;i>0;i=i/10)
        {
            m=m*10;
        }
        int f=0,l=0,sum=0;
        f=n%10;
        l=n/m;
        sum=f+l;
        System.out.println("Sum of first and last digit" + sum);
    }
    void isSpecial()
    {
        int t=0;int m=n;int fact=1,sum=0;
        while (m>0)
        {
            t=m%10;
            fact=1;
            for (int i=1;i<=t;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            m=m/10;
        }
        if (sum==n)
        {
            System.out.println("It is a special number");
        }
        else
        {
            System.out.println("It is not a special number");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a special number or not");
        int m=sc.nextInt();
        SpecialNumber obj=new SpecialNumber(m);
        obj.sum();
        obj.isSpecial();
    }
}
            
        