import java.util.*;
class Perimeter 
{
    double a;
    double b;
    
    Perimeter (double a1,double b1)
    {
        a=a1;
        b=b1;
    }
    
    double Calculate()
    {
        double p=2*(a+b);
        return p;
    }
    
    void show()
    {
        System.out.println("Length=" + a);
        System.out.println("Breadth=" + b);
        double p1=Calculate();
        System.out.println("Perimeter=" + p1);
    }
}
    