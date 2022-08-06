import java.util.*;
class Product
{
    String name;
    int code;
    double amount;
    Product(String n, int c, double p)
    {
        name=n;
        code=c;
        amount=p;
    }
    void show()
    {
        System.out.println("Name of the product:" + name);
        System.out.println("Code of the product:" + code);
        System.out.println("Amount of the product:" + amount);
    }
}
        