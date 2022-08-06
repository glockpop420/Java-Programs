import java.util.*;
class MatrixSorting
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a matrix with n columns and rows (min 3 and max 10)");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[]=new int[n*n];
        int x=0;
        if (n<3 || n>10)
        {
            System.out.println("invalid Range");
        }
        else
        {
            System.out.println("Enter the elements of the array");
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                    b[x++]=a[i][j];
                }
            }
            System.out.println("The given matrix is:");
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            int temp;
            for (int i=0;i<b.length;i++)
            {
                for (int j=0;j<b.length-1-i;j++)
                {
                    if (b[j]>b[j+1])
                    {
                        temp=b[j];
                        b[j]=b[j+1];
                        b[j+1]=temp;
                    }
                }
            }
            x=0;
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    a[i][j]=b[x++];
                }
            }
            System.out.println("The sorted matrix is:");
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}