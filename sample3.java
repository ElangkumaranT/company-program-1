import java.util.*;
public class sample3
{
    public static void counttriplete(int a[],int n)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int s=a[i]+a[j];
                for(int k=0;k<n;k++)
                {
                    if(a[k]==s)
                    {
                        c=c+1;
                        System.out.println(a[i]+" "+a[j]);
                        break;
                    }
                }
                
            }
        }
        System.out.println(c);
    }
    {

    }
    public static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
        int n=4;
        int a[]={1,5,3,2};
        counttriplete(a,n);
    }
}