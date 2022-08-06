import java.util.*;
class number 
{
    int n;
    number (int nn)
    {
        n=nn;
    }
    int factorial (int a)
    {
        int prod=1;
        for (int i=1;i<=a;i++)
        {
                prod=prod*i;
        }
        return prod;
    }
    void display()
    {
        System.out.println("Number entered:" + n);
    }
}
    