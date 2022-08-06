import java.util.*;
class PrimeRecur
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        PrimeRecur obj=new PrimeRecur();
        if (obj.prime(a,a-1))
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
    boolean prime(int a,int i)
    {
        if (i==1)
        {
            return true;
        }
        if (a%i==0)
        {
            return false;
        }
        else
        {
            return prime(a,i-1);
        }
    }
}
        
            
        