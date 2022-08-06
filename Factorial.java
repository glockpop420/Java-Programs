import java.util.*;
class Factorial
{
    static int n;
    static int f;
    Factorial()
    {
        n=0;
        f=0;
    }
    public static void main()
    {
        Factorial obj=new Factorial();
        obj.read();
        int a=n;
        f=obj.fact(a);
        obj.display();
    }
    int fact(int n)
    {
        if(n!=1)
         return n*(fact(n-1));
        return 1;
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT: ");
        n=sc.nextInt();
    }
    void display()
    {
        System.out.println("OUTPUT: "+f);
    }
}
