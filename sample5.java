import java.util.*;
public class sample5
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
    public void display(int n)
    {
        node temp1=head,temp2;
        int m=n/2;
        for(int i=0;i<m+1;i++)
        {
          
           temp2=head.next;
           for(int j=i-1;j<m;j++)
           {
            temp2=temp2.next;
           }
           int s=temp1.d -temp2.d;

      
           System.out.print(s+"->");
            temp1=temp1.next;
           
        }
        
    }
     public static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
        sample5 obj=new sample5();
        int n=5;
        int a[]={5,4,3,2,1};
        for(int i=0;i<n;i++)
        {
        obj.create(a[i]);
        }


        obj.display(n);
        for(int i=n/2+1;i<n;i++)
        {
            if(i!=n-1)
            System.out.print(a[i]+"->");
            else 
            System.out.print(a[i]);
        }
            
    }
}