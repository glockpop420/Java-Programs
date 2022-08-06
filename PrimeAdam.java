import java.util.*;
class PrimeAdam
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers m and n (m<n) to check the Prime Adam numbers within numbers");
        System.out.println("m=");
        int m=sc.nextInt();
        System.out.println("n=");
        int n=sc.nextInt();
        int c=0;
        if (m<n)
        {
            for (int i=m;i<=n;i++)
            {
                if (prime(i)==true)
                {
                    if (adam(i)==true)
                    {
                        System.out.println(i);
                        c++;
                    }
                }
            }
            System.out.println("Frequency of the Prime-Adam numbers within the range:" + c);
        }
        else
        {
            System.out.println("Enter a valid range");
            System.exit(0);
        }
    }
    public static boolean prime(int a)
    {
        int c=0;
        for (int i=2;i<a;i++)
        {
            if (a%i==0)
            {
                c++;
            }
        }
        if (c==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static boolean adam(int b)
    {
        int sq=b*b;
        int b1=b;       
        int revb=0,d=1;
        while (b1>0)
        {
            d=b1%10;
            revb=(revb*10) + d;
            b1=b1/10;
        }
        int sq1=revb*revb;
        int sq2=sq1;
        int revsq1=0,d1=1;
        while (sq2>0)
        {
            d1=sq2%10;
            revsq1=(revsq1*10) + d1;
            sq2=sq2/10;
        }
        if (revsq1==sq)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
            
    