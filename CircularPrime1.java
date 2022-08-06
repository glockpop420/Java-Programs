import java.util.*;
class CircularPrime1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a circular prime or not");
        int n=sc.nextInt();
        int n1=n;
        int c=0;
        while (n1>0)
        {
            n1=n1/10;
            c++;
        }
        int a[]=new int[c];
        int b[]=new int[c];
        int n2=n;        
        int d=1;
        int e=c;
        while (n2>0)
        {
            d=n2%10;
            a[e-1]=d;
            n2=n2/10;
            e--;
        }
        System.out.println("The digits present in the number are:");
        for (int j=0;j<c;j++)
        {
            System.out.println(a[j]);
        }
        
    }
}
                
                
                
                
                
                
        
