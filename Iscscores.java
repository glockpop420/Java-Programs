import java.util.*;
class Iscscores
{
    int n[][];
    Scanner sc=new Scanner(System.in);
    Iscscores (int n[][])
    {
        System.out.println("Enter marks");
        n=new int[6][2];
        for (int i=0;i>1;i++)
        {
            for (int j=0;j>6;j++)
            {
                n[i][j]=sc.nextInt();
            }
        }
    }
    
    int Point(int x)
    {
        if(n[x][0]>=90)
        {
            return 1;
        }
        else if(n[x][0]>=80)
        {
            return 2;
        }
        else if(n[x][0]>=70)
        {
            return 3;
        }
        else if(n[x][0]>=60)
        {
            return 4;
        }    
        else if(n[x][0]>=50)
        {
            return 5;
        }
        else if(n[x][0]>=40)
        {
            return 6;
        }
        else
        {
            return 7;
        }
    }
}