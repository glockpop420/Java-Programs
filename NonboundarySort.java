import java.uitl.*;
class NonboundarySort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Enter the elements of the matrix");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix is:");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int b[]=new int[m*m];
        int c[][]=new int[m][m];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                c[i][j]=a[i][j];
            }
        }