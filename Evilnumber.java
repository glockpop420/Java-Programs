import java.util.*;
class Evilnumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to chech whether it is a evil number or not");
        int n=sc.nextInt();
        int count=0,c=0,l=0;
        int A[]=new int[100];
        while (n>0)
        {
            l=n%2;
            A[c]=l;
            if (l==1)
            {
                count++;
                n=n%2;
                c++;
            }
        }
        System.out.println("Binary equivalent:");
        for (int i=c-1;i>=0;i--)
        {
            System.out.print(A[i] + "\t");
            System.out.println("\nNo of 1's:" + count);
        }
        if (count%2==0)
        {
            System.out.println("It is an evil number");
        }
        else 
        {
            System.out.println("It is not an evil number");
        }
    }
}
            
        