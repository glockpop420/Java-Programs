import java.util.*;
class packlage
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of boxes to be packed (max 1000)");
        int n=sc.nextInt();
        if (n>1000 || n<0)
        {
            System.out.println("invalid input");
            System.exit(0);
        }
        int n1=n;
        int fe=0,tf=0,t=0,s=0,e=0;
        if (n1/48!=0)
        {
            fe=n1/48;
            n1=n1-(fe*48);
        }
        if (n1/24!=0)
        {
            tf=n1/24;
            n1=n1-(tf*24);
        }
        if (n1/12!=0)
        {
            t=n1/12;
            n1=n1-(t*12);
        }
        if (n1/6!=0)
        {
            s=n1/6;
            n1=n1-(s*24);
        }
        if (n1<6 && n1>0)
        {
            e=n1;
        }
        System.out.println("Number of boxes:" + n);
        int c=0;
        if (fe!=0)
        {
            System.out.println("48*" + fe + "=" + (48*fe));
        }
        if (tf!=0)
        {
            System.out.println("24*" + tf + "=" + (24*tf));
        }
        if (t!=0)
        {
            System.out.println("12*" + t + "=" + (12*t));
        }
        if (s!=0)
        {
            System.out.println("6*" + s + "=" + (6*s));
        }
        if (e!=0)
        {
            System.out.println("Remaining boxes:" + "1*" + e+ "=" + e);
            c++;
        }
        System.out.println("Number of cartons used:" + (fe+tf+t+s+c));
    }
}