import java.util.*;
class CircularPrime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a circular number or not");
        int n=sc.nextInt();
        int n1=n;
        int c=0;
        while (n1>0)
        {
            n1=n1/10;
            c++;
        }
        int a[]=new int[c];
        int n2=n;
        int d=1;
        for (int i=c-1;i>=0;i--)
        {
            d=n2%10;
            a[i]=d;
            n2=n2/10;
        } 
        System.out.println("The digits present in the number are:");
        for (int j=0;j<c;j++)
        {
            System.out.println(a[j]);
        }
        int cp=0;
        int b=0;
        for (int i=0;i<c;i++)
        {
            b=circular(a);
            if (isPrime(b)==true)
            {
                cp++;
            }
        }
        if (cp==c)
        {
            System.out.println("It is a circular prime number");
        }
    }
    public static int circular(int h[])
    {
        int e=1;
        int x=h.length();
        for (int i=0;i<x;i++)
        {
            h[i]