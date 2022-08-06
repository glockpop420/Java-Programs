import java.util.*;
class Series extends number
{
    int sum;
    Series(int nn)
    {
        super (nn);
        sum=0;
    }
    void calsum()
    {
        for (int i=1;i<=n;i++)
        {            
            sum=sum + factorial(i);
        }
    }
    void display()
    {
        super.display();
        System.out.println("Sum of the all the factorials before the number:" + sum);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print the sum of all the factorials before the number");
        int n1=sc.nextInt();
        Series obj=new Series(n1);
        obj.calsum();
        obj.display();
    }
}