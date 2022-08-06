import java.util.*;
class CeaserCipher
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to convert it to convert the sentence with ceaser cipher");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," !?,-");
        s=s.toLowerCase();
        int x=st.countTokens();
        char ch;
        String w="";
        int n;
        String s1="";
        for (int i=0;i<x;i++)
        {
            w=st.nextToken();
            int len=w.length();
            for (int j=0;j<len;j++)
            {
                ch=w.charAt(j);
                n=(int)ch;
                n=n+13;
                if (n>122)
                {
                    n= (n-122) + 96;
                }                
                s1=s1+(char)n;
            }
            s1=s1+" ";
        }
        System.out.println("Sentence after ceaser cipher:" + s1);
    }
}