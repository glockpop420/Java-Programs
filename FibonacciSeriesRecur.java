import java.util.*;
class FibonacciSeriesRecur
{
    int n1=0,n2=1,n3=2;
    void printFibo(int c)
    {
        if (c>0)
        {
            n3=n1 +n2;
            n1=n2;
            n2=n3;
            System.out.print(" " + n3);
            printFibo(c-1);
        }
        System.out.println();
    }   
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        FibonacciSeriesRecur obj=new FibonacciSeriesRecur();
        obj.printFibo(n);
    }
}
        
            
        
        