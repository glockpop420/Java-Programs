import java.util.*;
class V_atBnE
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to check the number of words which begin and end with a vowel");
        String s=sc.nextLine();
        s=s.toUpperCase();
        StringTokenizer st=new StringTokenizer(s," ?!.-");
        int x=st.countTokens();
        String w="";
        char ch;
        int c;
        int v=0;
        String s1="";
        String s2="";
        for (int i=0;i<x;i++)
        {
            w=st.nextToken();
            int len=w.length();
            c=0;
            for (int j=0;j<len;j++)
            {
                ch=w.charAt(j);
                if (j==0 && (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
                {
                    c++;
                }
                if (j==(len-1) && (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
                {
                    c++;
                }
            }
            if (c==2)
            {
                v++;
                s1=s1+w+" ";
            }
            else
            {
                s2=s2+w+" ";
            }
        }
        System.out.println("Frequency of the words beginning and ending with a vowel:" + v);
        System.out.println("New sentence:" + s1 + s2);
    }
}
        
            