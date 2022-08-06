import java.util.*;
class AscendingOrderP
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to find the potential of every word in the sentence");
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8,i=9,j=10,k=11,l=12,m=13,n=14,o=15,p=16,q=17,r=18,s=19,t=20,u=21,v=22,w=23,x=24,y=25,z=26;
        StringTokenizer st=new StringTokenizer(s1," ,.!?");
        int x1=st.countTokens();
        String h1="";
        char ch;
        int ln;
        int sum=0;
        for (int i1=0;i<x1;i++)
        {
            h1=st.nextToken();
            ln=h1.length();
            for (j=0;j<ln;j++)
            {
                ch=h1.charAt(j);
                switch (ch)
                {
                    case 'a':sum=sum+a;
                             break;
                    case 'b':sum=sum+b;
                             break;
                    case 'c':sum=sum+c;
                             break;
                    case 'd':sum=sum+d;
                             break;
                    case 'e':sum=sum+e;
                             break;
                    case 'f':sum=sum+f;
                             break;
                    case 'g':sum=sum+g;
                             break;
                    case 'h':sum=sum+h;
                             break;
                    case 'i':sum=sum+i;
                             break;
                    case 'j':sum=sum+j;
                             break;
                    case 'k':sum=sum+k;
                             break;
                    case 'l':sum=sum+l;
                             break;
                    case 'm':sum=sum+m;
                             break;
                    case 'n':sum=sum+n;
                             break;
                    case 'o':sum=sum+o;
                             break;
                    case 'p':sum=sum+p;
                             break;
                    case 'q':sum=sum+q;
                             break;
                    case 'r':sum=sum+r;
                             break;
                    case 's':sum=sum+s;
                             break;
                    case 't':sum=sum+t;
                             break;
                    case 'u':sum=sum+u;
                             break;
                    case 'v':sum=sum+v;
                             break;
                    case 'w':sum=sum+w;
                             break;
                    case 'x':sum=sum+x;
                             break;
                    case 'y':sum=sum+y;
                             break;
                    case 'z':sum=sum+z;
                             break;
                    default :sum=sum+0;
                             break;
                }
            }
            System.out.println(h1 + ":" + sum);
        }
    }
}