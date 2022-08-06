import java.util.*;
class PronicNumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a pronic number or not");
        int n=sc.nextInt();
        int k=(int)(Math.sqrt(n));
        if (k*(k+1)==n)
        {
            System.out.println("It is a pronic number");
        }
        else
        {
            System.out.println("It is not pronic number");
        }
    }
}