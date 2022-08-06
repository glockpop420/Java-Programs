import java.util.*;
class Detail
{
    String name;
    String address;
    long telno;
    double rent;
    
    Detail (String name,String address,long telno,double rent)
    {
        this.name=name;
        this.address=address;
        this.telno=telno;
        this.rent=rent;
    }
    
    void show()
    {
        System.out.println("Name of the customer:" + name);
        System.out.println("Address of the customer:" + address);
        System.out.println("Phone number of the customer:" + telno);
        System.out.println("Monthly rent of the customer:" + rent);
    }
}