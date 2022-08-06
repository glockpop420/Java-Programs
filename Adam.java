import java.util.*;
class Adam
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whther it is a adam number or not");
        int b=sc.nextInt();
        int sq=b*b;
        System.out.println("Square of the number is:" + sq);
        int b1=b;       
        int revb=0,d=1,e=1;
        while (b1>0)
        {
            d=b1%10;
            revb=(revb*10) + d;
            b1=b1/10;
        }
        System.out.println("Reverse of the accepted number is:" + revb);
        int sq1=revb*revb;
        int sq2=sq1;
        System.out.println("Square of the reversed number is:" + sq1);
        int revsq1=0,d1=1,e1=1;
        while (sq2>0)
        {
            d1=sq2%10;
            revsq1=(revsq1*10) + d1;
            sq2=sq2/10;
        }
        System.out.println("Reverse of the square of the reversed number:" + revsq1);
    }
}