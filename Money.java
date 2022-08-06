import java.util.*;
class Money
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give amount (max 99999)");
        int n=sc.nextInt();
        int n1=n;
        int th=0,fh=0,h=0,fi=0,tw=0,te=0,f=0,t=0,o=0;
        System.out.println("output:");
        int d;
        int n2=n;
        if (n2/1000!=0)
        {
            th=n2/1000;
            n2=n2-(th*1000);
        }
        if (n2/500!=0)
        {
            fh=n2/500;
            n2=n2-(fh*500);
        }
        if (n2/100!=0)
        {
            h=n2/100;
            n2=n2-(h*100);
        }
        if (n2/50!=0)
        {
            fi=n2/50;
            n2=n2-(fi*50);
        }
        if (n2/20!=0)
        {
            tw=n2/20;
            n2=n2-(tw*20);
        }
        if (n2/10!=0)
        {
            te=n2/10;
            n2=n2-(te*10);
        }
        if (n2/5!=0)
        {
            f=n2/5;
            n2=n2-(f*5);
        }
        if (n2/2!=0)
        {
            t=n2/2;
            n2=n2-(t*2);
        }
        if (n2/1!=0)
        {
            o=n2/1;
            n2=n2-(o*1);
        }
        if (th!=0)
        {
            System.out.println("1000*" + th + "=" + (1000*th));
        }
        if (fh!=0)
        {
            System.out.println("500*" + fh + "=" + (500*fh));
        }
        if (h!=0)
        {
            System.out.println("100*" + h + "=" + (100*h));
        }
        if (fi!=0)
        {
            System.out.println("50" + fi + "=" + (50*fi));
        }
        if (tw!=0)
        {
            System.out.println("20*" + tw + "=" + (20*tw));
        }
        if (te!=0)
        {
            System.out.println("10*" + te + "=" + (10*te));
        }
        if (f!=0)
        {
            System.out.println("5*" + f + "=" + (5*f));
        }
        if (t!=0)
        {
            System.out.println("2*" + t + "=" + (2*t));
        }
        if (o!=0)
        {
            System.out.println("1*" + o + "=" + (1*o));
        }
        System.out.println("Number of notes:" + (th+fh+h+fi+tw+te+f+t+o));
    }
}
        