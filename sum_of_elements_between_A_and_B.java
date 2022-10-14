import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],k=0,sum=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]>=b && a[i]<=c)
            {
                k=1;
            sum+=a[i];
            }
            else
            {
            continue;
            }
        }
        if(k==0)
        System.out.print("-1");
        else
        System.out.print(sum);
    }
}