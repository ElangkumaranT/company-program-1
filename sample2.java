import java.util.*;
public class sample2
{
    public static void findmin(int a[],int n)
    {
        int s1=0,s2=0,min=100,k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(a[i]>a[j])
                    k=a[i]-a[j]; 
                    else
                    k=a[j]-a[i];

                    if(min>k)
                    {
                        min=k;
                        s1=a[i];
                        s2=a[j];
                    }
                }
            }
        }
        System.out.print("differents :"+min+"\n Elements are :"+s1+" "+s2);

    }
    public static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
        int n=7;
        int a[]={1,19,-4,31,38,25,100};
        findmin(a,n);

    }
}