import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],sum=0;
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
            continue;
            else
            {
            sum+=a[i];
            }
        }
        System.out.print(sum);
    }
}