import java.io.*;
class Perfect
{
    private int num;
    public Perfect(int n)
    {
        num = n;
    }
    public int sumOfFactors(int i)
    {
        if(i == 1)
        {
            return 1 + sumOfFactors(i + 1);
        }
        else if(i < num && num % i == 0)
        {
            return i + sumOfFactors(i + 1);
        }
        else if(i < num && num % i != 0)
        {
            return 0 + sumOfFactors(i + 1);
        }
        else
        {
            return 0;
        }
    }
    public void check()
    {
        if(num == sumOfFactors(1))
        {
            System.out.println(num + " is a Perfect Number");
        }
        else
        {
            System.out.println(num + " is not a Perfect Number");
        }
    }
    public static void main(String args[])
    throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Enter a number to check whether it is a perfect number or not");
        int n = Integer.parseInt(br.readLine());
        Perfect obj = new Perfect(n);
        obj.check();
    }
}