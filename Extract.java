import java.util.*;
class Extract
{
    static int n;
    Extract()
    {
        n=0;
    }
    public static void main()
    {
        Extract obj=new Extract();
        obj.inpnum();
        int a=n;
        int p=obj.extdigit(a);
    }
    int extdigit(int a)
    {
        if(a!=0)
        {
            System.out.println((a%10));
            return extdigit(a/10);  
        }
        return 1;
    }
    void inpnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT: ");
        n=sc.nextInt();
    }
}
