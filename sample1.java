import java.util.*;
public class sample1
{
    public static void find(int a[],int n)
    {
        int c=0;
        String s="";
        System.out.print("duplicate elements :");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                String k=Integer.toString(a[i]);
                if(s.contains(k)==false)
                {
                c=c+1;
                System.out.print(a[i]+" ");
                s=k+" ";
                break;
                }
                }
            }
        }
        System.out.println();
       System.out.println("count :"+c);

    }
    public static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
       int n=9;
        int a[]={5,3,4,6,7,5,3,3,1};
        // for(int i=0;i<n;i++)
        // a[i]=o.nextInt();

        find(a,n);
       


    }
}