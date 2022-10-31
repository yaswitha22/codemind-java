import java .util.*;
class frequent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int si=sc.nextInt();
            int sum=0,t=0;
            int a[]=new int[si];
            for(int i=0;i<si-1;i++)
            a[i]=sc.nextInt();
            for(int i=0;i<si-1;i++)
            {
                sum+=a[i];
            }
            t=(int)(si*(si+1))/2;
            System.out.println(t-sum);
        }
    }
}