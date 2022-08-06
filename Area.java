import java.util.*;
class Area extends Perimeter
{
    double h;
    double area;
    
    Area(double a2,double b2,double h1)
    {
        super(a2,b2);
        h=h1;
    }
    
    void doarea()
    {
        area=b*h;
    }
    
    void show()
    {
        super.show();
        System.out.println("Height:" + h);
        System.out.println("Area:" + area);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        double length=sc.nextDouble();
        System.out.println("Enter breadth:");
        double breadth=sc.nextDouble();
        System.out.println("Enter height");
        double height=sc.nextDouble();
        Area ap=new Area(length,breadth,height);
        ap.doarea();
        ap.show();
    }
}