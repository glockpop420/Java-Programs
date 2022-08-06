import java.util.*;
class BinaryToDecimal
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number to be converted to decimal");
        int n=sc.nextInt();
        int p=0;int a=0;
        int m=n;
        while (m>0)
        {
            int l=m%10;
            m=m/10;
            a=a + (int)(l*Math.pow(2,p));
            p++;
        }
        System.out.println("Binary equivalent:" + a);
    }
}
    