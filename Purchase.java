import java.util.*;
class Purchase extends Stock
{
    int pqty;
    double prate;
    Purchase(String i,int q,double r,double a,int pq)
    {
        super (i,q,r,a);
        pqty=pq;
        prate=0.0;
    }
    void update()
    {
        