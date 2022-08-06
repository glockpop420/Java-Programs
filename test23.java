import java.util.*;
class test23
{
    static String s="",word=""; static String t="";
    static int l=0,k=0,i;
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        s=sc.nextLine();
        l=s.length();
        char c=s.charAt(l-1);
        if(c=='?'||c=='.')
        {
            String s1=s.substring(0,(l-1));
            int l1=s1.length();
            String a[]=new String[l1];
            for( i=0;i<(l1);i++)
            {
                char ch=s1.charAt(i);
                if(ch!=' ')
                {
                    word=word+ch;
                }
                else
                {
                    a[k]=word;
                    k++;
                    word="";
                }
            }
            int n=a.length;
             for(int i=0; i < n-1; i++)
             {  
                 for(int j=1; j < (n-i-1); j++)
                 {  
                          if(a[j].compareTo(a[j+1])>0)
                          {  
                                 //swap elements  
                                 t = a[j];  
                                 a[j] = a[j+1];  
                                 a[j+1] = t;
                                }
                                }
                            }
            System.out.println("Length="+k);
            for(int g=0;g<a.length;g++)
            {
                System.out.print(g+" ");
            }
        }
        
           
        else
        { System.out.println("Invalid");
        }
    }
}
