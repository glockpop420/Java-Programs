import java.util.*;
class Stock
{
    String item;
    int qty;
    double rate;
    double amt;
    Stock(String i,int q,double r,double a)
    {
        item=i;
        qty=q;
        rate=r;
        amt=a;
    }
    void display()
    {
        System.out.println("Name of the item:" + item);
        System.out.println("Quantity of the item in stock" + qty);
        System.out.println("Unit price of the item" + rate);
        System.out.println("Net value of the item in stock" + amt);
    }
}