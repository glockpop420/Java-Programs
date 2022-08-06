import java.util.*;
class PrimePalindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,rev=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                c++;
            }
            else
            {
                continue;
            }
        }
        if (c==2)
        {
            int a=n;
            while (a!=0)
            {
                int d=a%10;
                rev=(rev*10)+d;
                a=a/10;
            }
            if (rev==n)
            {
                System.out.println("It is a prime palindrome number");
            }
            else
            {
                System.out.println("It is not a prime palindrome number");
            }
        }
        else 
        {
            System.out.println("It is not a prime palindrome number");
        }
    }
}