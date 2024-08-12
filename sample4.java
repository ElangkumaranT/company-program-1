import java.util.*;
public class sample4
{
   class node
    {
     int d;
     node next;
     node(int k)
     {
        d=k;
        next=null;
     }
    

    }
    node head=null,tail=null;
    public void create(int d)
    {
      node newnode = new node(d);
        if(head==null)
        {
            head=tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void display(int k,int n)
    {
        node temp=head;
        int c=n,p=0,t=k;
        
        while(k<=c)
        {
            
        for(int i=k;i>p;i--)
        {
           temp=head;
            int u=1;
            for(int j=0;j<i-1;j++)
            {
             temp=temp.next;
             
              }
            System.out.print(temp.d+"->");
        }
        p=p+t;
        if(k==c)
        break;
        if(k+t<=c)
        k=k+k;
        else
        {
            int l=c-k;
            if(l<k)
            {
                k=k+l;
            }
            else
            break;
        }
        }
    }
    public static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
        sample4 obj=new sample4();
        int n=8;
        int a[]={1,2,3,4,5,6,7,8};
        for(int i=0;i<n;i++)
        obj.create(a[i]);

        int k=3; 
        obj.display(k,n);

        
    }
}