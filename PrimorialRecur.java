import java.util.*;
class PrimorialRecur
{
    int checkPrime(int a,int b)
    {
        if (a>b)
        {
            if (a%b!=0)
            {
                return checkPrime(a,b++);
            }
            else
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check its primorial");
        int n=sc.nextInt();
        int p=1;int k;
        PrimorialRecur obj=new PrimorialRecur();
        for (int i=2;i<=n;i++)
        {
            k=obj.checkPrime(i,n);
            if (k==1)
            {
                p=p*i;
            }
            System.out.println("Primorial Number:" + n + "#" + p);
        }
    }
}