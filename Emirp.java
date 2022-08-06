import java.util.*;
class Emirp
{
    // Data members
    int n;
    int rev;
    int f;
    // Parameterised constructor
    Emirp(int nn)
    {
        n = nn;
        rev = 0;
        f = 2;
    }
    int isprime(int x)
    {
        if(n == x)
        {
            return 1;
        }
        else if(n%x == 0 || n == 1)
        {
            return 0;
        }
        else
        {
            return isprime(x + 1);
        }
    }
    void isEmirp()
    {
        int x = n;
        while(x != 0)
        {
            rev = (rev * 10) + x%10;
            x = x/10;
        }
        int ans1 = isprime(f);
        n = rev;
        f = 2;
        int ans2 = isprime(f);
        if(ans1==1 && ans2==1)
        {
            System.out.println("It is an Emirp Number");
        }
        else
        {
            System.out.println("It is NOT an Emirp Number");
        }
    }
    public static void main() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: "); // Inputting the original number
        int x = sc.nextInt();
        // Object Creation
        Emirp ob = new Emirp(x);
        ob.isEmirp();
    }  
}
