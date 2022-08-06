import java.util.*;
class KaprekarNumber
{
    int m,n;
    public static void main()
    {
        Scanner sc=new Scanner(Syetem.in);
        System.out.println("Enter two numbers to check the kaprekar numbers within that range");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int m=p,n=q;
        if (p>q || p==q)
        {
            System.out.println("Invalid range");
            System.exit(0);
        }
        System.out.println("The kaprekar numbers within the range are:");
        for (int i=p;i<=q;i++)
        {
            int x=checkKaprekar(i);
            if (x==1)
            {
                System.out.println(i);
            }
        }
    }
    void checkKaprekar()
    {
        int count=0;
        for (int i=m;i<=n;i++)
        {
            int y=i*i;
            int z=y;
            while (y>0)
            {
                y=y%10;
                count++;
            }
            if (count%2==0)
            {
                int a=count/2;
                int b=count/2;
            }
            else
            {
                int a=count/2;
                int b=count-(count/2);
            }
            String number = String.valueOf(z);
            char[] digits1 = number.toCharArray();
            
            for (int j=a-1;j>=0;j--)
            {
                
                
            
                
                
            
                
            
        