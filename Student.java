import java.util.*;
class Student
{
    static String name;
    static String dob;
    static int roll;
    Student(String a,String b,int cc)
    {
        name=a;
        dob=b;
        roll=cc;
    }
    void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter dob");
        dob=sc.next();
        System.out.println("Enter roll number");
        roll=sc.nextInt();
    }
    void printdata()
    {
        System.out.println("Name : "+name);
        System.out.println("DOB : "+dob);
        System.out.println("Roll no. : "+roll);
    }
}
class Marks extends Student
{
    static float p,m,c,cts,e;
    static float tot,per;
    static char gd;
    
   
Marks(String a,String b,int cc,float d,float e,float f,float g,float h)
    {
        super(a,b,cc);
        p=d;
        m=e;
        c=f;
        cts=g;
        e=h;
    }
    void readdata()
    {
        super.inputdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics,Maths,Chemistry,Computer and English marks out of 100 respectively.");
        p = sc.nextFloat();
        m=sc.nextFloat();
        c=sc.nextInt();
        cts=sc.nextFloat();
        e=sc.nextFloat();
    }
    void compute()
    {
        tot=p+m+c+cts+e;
        per=(tot/500)*100;
    }
    void showdata()
    {
        super.printdata();
        System.out.println("Physics marks : " +p);
        System.out.println("Maths marks : " +m);
        System.out.println("Chemistry marks : " +c);
        System.out.println("Computer marks : " +cts);
        System.out.println("English marks : " +e);
        System.out.println("Total marks : "+tot);
        System.out.println("Percentage : "+per);
        if(per>=90)
        {
            System.out.println("Grade : "+"A");
        }
        else if(per>=60 && per<90)
        {
            System.out.println("Grade : "+"B");
        }
        else if(per>=40 && per<60)
        {
            System.out.println("Grade : "+"C");
        }
        else if(per<40)
        {
            System.out.println("Grade : "+"D");
        }
    }
    public static void main()
    {
        Marks ob = new Marks(name,dob,roll,p,m,c,cts,e);
        ob.readdata();
        ob.compute();
        ob.showdata();
    }
}
