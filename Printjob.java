import java.util.*;
class Printjob
{
    // Data Members
    int job[];
    int newjob;
    int capacity;
    int front;
    int rear;
    // Default Constructor
    Printjob()
    {
        capacity = 20;
        front = -1;
        rear = -1 ;
        createJob();    
    }
    void createJob()
    {
        job = new int[capacity];
    }
    void addJob()
    {
        int id =0;
        // Accepting Job ID
        System.out.println("Enter the job id of new print job ");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        newjob = id;
        if(rear == -1)
        {
            front = rear = 0;
            job[rear] = id;
        }
        else if(rear < job.length)
        {
            job[++rear] = id;
        }
        else
        {
            System.out.println("Printjob is full.");
        }
    }
    public void removeJob()
    {
        int elem;
        if(front==rear)
        {
            System.out.println("Printjob is Empty");
        }
        else
        {
            elem = job[front];
            front++;
            System.out.println("The job removed is "+elem);
        }
    }
    public static void main()
    {
        // Object Creation
        Printjob obj = new Printjob();
        obj.createJob();
        obj.addJob();
        obj.addJob();
        obj.removeJob();
    }
}
