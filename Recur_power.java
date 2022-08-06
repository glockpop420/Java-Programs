import java.util.*;
class Recur_power
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Recur_power obj=new Recur_power();
        System.out.println("Enter a number");
        int x=sc.nextInt();
        System.out.println("Enter its power");
        int y=sc.nextInt();
        int a=obj.power(x,y);
        System.out.println("Ans: "+a);
    }
    int power(int x,int y)
    {
        if(y==1)
         return x;
        else
         return x*power(x,y-1);
    }
}
