import java.util.*;
class DecimalToBinary
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number to be coverted to binary");
        int n=sc.nextInt();
        int A[]=new int[100];
        int m=n;int count=0;
        for (int i=0;i<n/2;i++)
        {
            A[i]=m%2;
            m=m/2;
            count++;
        }
        for (int j=count-1;j>=0;j--)
        {
            System.out.print(A[j]);
        }
        System.out.println();
    }
}
        
        
        