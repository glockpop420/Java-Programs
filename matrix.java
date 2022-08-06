import java.util.*;
class matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows greater than 2 and lesser than 8");
        int m=sc.nextInt();
        if (m<=2 || m>=8)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("Enter number of columns greater than 2 and lesser than 8");
        int n=sc.nextInt();
        if (n<=2 || n>=8)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[]=new int[m*n];
        System.out.println("enter elements of the matrix");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("given matrix is:");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int sumb1=0;
        int sumb2=0;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==0 || i==(m-1) || j==0 || j==(n-1))
                {
                    sumb1=sumb1 + a[i][j];
                }
            }
        }
        System.out.println("sum of boundary elements(before sorting)" + sumb1);
        int d=0;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                c[d]=a[i][j];
                d++;
            }
        }
        int temp=0;
        for (int i=0;i<(m*n);i++)
        {
            for (int j=0;j<(m*n)-i-1;j++)
            {
                if (c[j]<c[j+1])
                {
                    temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        int e=0;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                b[i][j]=c[e];
                e++;
            }
        }
        System.out.println("Sorted matrix is:");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
         for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==0 || i==(m-1) || j==0 || j==(n-1))
                {
                    sumb2=sumb2 + b[i][j];
                }
            }
        }
        System.out.println("sum of boundary elements (after sorting)" + sumb2);
    }
}