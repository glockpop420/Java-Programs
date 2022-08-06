import java.util.*;
class Library
{
    String name;
    String author;
    double p;
    Library(String n,String a,double p1)
    {
        name=n;
        author=a;
        p=p1;
    }
    void show()
    {
        System.out.println("Name of the book:" + name);
        System.out.println("Author of the book:" + author);
        System.out.println("Price of the book:" + p);
    }
}
        