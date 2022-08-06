import java.util.*;
class InOrDeOrBo
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an increasing or decreasing or bouncy number");
        int n=sc.nextInt();
        if (increasing(n)==1)
        {
            System.out.println("It is an increasing number");
        }
        else if (decreasing(n)==1)
        {
            System.out.println("It is a decreasing number");
        }
        else 
        {
            System.out.println("It is a bouncy number");
        }
    }
    public static int increasing(int a)
    {
        String b=Integer.toString(a);
        char ch;
        char ch1;
        int c=0;
        int f;
        for (int i=0;i<b.length();i++)
        {
            ch=b.charAt(i);
            ch1=b.charAt(i++);            
            if (ch>ch1)
            {
                c++;
            }          
        }
        if (c!=0)
        {
            f=0;
        }
        else
        {
            f=1;
        }
        return f;
    }
    public static int decreasing(int d)
    {
        String b=Integer.toString(d);
        char ch;
        char ch1;
        int c=0;
        int e;
        for (int i=0;i<b.length();i++)
        {
            ch=b.charAt(i);
            ch1=b.charAt(i++);
            if (ch<ch1)
            {
                c++;
            }
        }
        if (c!=0)
        {
            e=0;
        }
        else
        {
            e=1;
        }
        return e;
    }
}

        
    