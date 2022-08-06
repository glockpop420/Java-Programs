import java.util.*;
class DisariumNumber
{
    public static void main()
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input a number : ");
         int num = sc.nextInt();
         int copy = num, d = 0, sum = 0;
         String s = Integer.toString(num);  
         int len = s.length();              
         while(copy>0)
         {
             d = copy % 10;  
             sum = sum + (int)Math.pow(d,len);
             len--;
             copy = copy / 10;
         }
         if(sum == num)
         {
               System.out.println("It is a Disarium Number");
         }
         else
         {
                System.out.println("It is not a Disarium Number");
         }
    }
}
