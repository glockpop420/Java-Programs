import java.util.*;
class BoundarySorting
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int m=sc.nextInt();
        int a[][]= new int[m][m];
        int i,j;
        System.out.println("enter the elements of the matrix:");
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original Matrix is:");
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int b[]=new int[m*m];
        int x=0;
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                b[x]=a[i][j];
                x++;
            }
        }
        int t=0;
        for (i=0;i<(m*m)-1;i++)
        {
            for (j=i+1;j<(m*m);j++)
            {
                if (b[i] > b[j])
                {
                    t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            }
        }
        x=0;
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                a[i][j]=b[x];
                x++;
            }
        }
        System.out.println("Sorted array is:");
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Boundary elements of the matrix is: ");
        for (i=0;i<m;i++)
        {
            for (j=0;j<m;j++)
            {
                if (i==0 || j==0 || i==m-1 || j==m-1)
                {
                    System.out.print(a[i][j] + "\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
            
        
        
        
        