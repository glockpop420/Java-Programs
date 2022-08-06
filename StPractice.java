import java.util.*;
class StPractice
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence to break it down into parts");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ,?!");
        int x=st.countTokens();
        String w="";
        for (int i=0;i<x;i++)
        {
            w=st.nextToken();
            System.out.println(w + " at " + i);
        }
    }
}