import java.util.*;
class SOD
{
    int isSOD(int a)
    {
        int d1;
        int sod=0;
        while (a>0)
        {
            d1=a%10;
            sod=sod + d1;
            a=a/10;
        }
        return sod;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 10000");
        int m=sc.nextInt();
        System.out.println("Enter another number to print the smallest required number whose sum of all its digits is equal to this number");
        int n=sc.nextInt();
        SOD ob=new SOD();
        if (m>=100 && m<=10000)
        {
            int d=0;
            for (int i=m;;i++)
            {
                int w=ob.isSOD(i);
                if (w==n)
                {
                    d=i;
                    break;
                }
            }
            System.out.println("The samllest required number is:" + d);
        }
        else
        {
            System.out.println("Invalid option");
        }
    }
}
                
                
        
    