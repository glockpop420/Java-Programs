import java.util.*;
class DecimalEquivalent2D
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if (m<=0 || m>=10)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        if (n<=1 || m>=6)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int a[][]=new int [m][n];
        System.out.println("Ennter values of matrix in octal representation only (0-7)");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                if (a[i][j]<0 || a[i][j]>7)
                {
                    System.out.println("invalid input");
                    System.exit(0);
                }
            }
        }
        System.out.println("The given matrix is:");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        double sum;
        for (int i=0;i<m;i++)
        {
            sum=0;
            for (int j=0;j<n;j++)
            {
                sum=sum + (Math.pow(8,(m-1-j)));
            }
            System.out.println("Decimal Equivalent is:" + sum);
        }
    }
}
        
                