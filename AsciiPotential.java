import java.util.*;
class AsciiPotential
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string value to find ascii potential of each word");
        String s=sc.nextLine();
        s=s.toUpperCase();
        StringTokenizer st=new StringTokenizer(s," .,!?");
        int x=st.countTokens();
        String word[]=new String[x];
        int pot[]=new int[x];
        int p;
        char ch;
        String w;
        int d;
        for(int i=0;i<x;i++)
        {
            w=st.nextToken();
            word[i]=w;
            int len=w.length();
            p=0;
            System.out.print(w + "=");
            for (int j=0;j<len;j++)
            {
                ch=w.charAt(j);
                d=Integer.valueOf(ch);
                p=p+d;
                
            }
            pot[i]=p;
            System.out.println(p);
        }
        
        int temp=0;
        String temp1="";
        for(int i=0; i < x; i++)
        {
             for(int j=1; j < (x-i); j++)
             {
                   if(pot[j-1] > pot[j])
                   {
                         //swap elements
                         temp = pot[j-1];                         
                         pot[j-1] = pot[j];
                         pot[j] = temp;
                         temp1=word[j-1];
                         word[j-1]=word[j];
                         word[j]=temp1;
                   }
             }
        }        
        System.out.println("Rearranged sentence is:");
        for (int i=0;i<x;i++)
        {
            System.out.print(word[i] + "\t");            
        }
    }
}