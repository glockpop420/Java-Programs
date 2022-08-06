import java.util.*;
class Revstr
{
    static String str;
    static String revst;
    void getstr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.nextLine();
    }
    void reverse(int n)
    {
       if(n!=0)
       {
           revst=revst+str.charAt(str.length()-1);
           reverse(str.length()-1);
       }
    }
    void check()
    {
        System.out.println("Original string: "+str);
        System.out.println("Reverse string : "+revst);
        if(str.equals(revst))
        {
            System.out.println("It is a palindrome string");
        }
    }
    public static void main()
    {
        Revstr obj=new Revstr();
        obj.getstr();
        obj.reverse(str.length());
        obj.check();
    }
}
