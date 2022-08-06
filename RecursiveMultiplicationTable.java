import java.util.Scanner;
public class RecursiveMultiplicationTable 
{
   public static void multiply(int num, int count)
   {
      if (count<=10)
      {
         System.out.println(num+" x "+count+" = "+num*count);
         multiply(num,++count);
      }
   }
   public static void main(String[] args)
   {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the number");
      int num=scan.nextInt();
 
      multiply(num, 1);
   }
}
