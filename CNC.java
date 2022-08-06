import java.util.*;
class CNC
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print the possible consecutive number combinations");
        int n=sc.nextInt();
        
        for (int i=1;i<n;i++)
        {
            int sum=0;
            sum=sum+i;
            for (int j=i+1;j<n;j++)
            {
                sum=sum+j;
                if (sum==n)
                {
                    for (int k=i;k<=j;k++)
                    {
                        System.out.print(k + "+");
                    }
                    System.out.println();
                }
            }
        }
    }
}