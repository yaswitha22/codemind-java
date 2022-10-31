import java .util.*;
class triplets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int c=0,sum=0;
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    sum=0;
                    if(i!=j)
                    {
                    sum=a[i]+a[j];
                    for(int h=0;h<n;h++)
                    {
                        if(sum==a[h]&& sum!=a[i]&&sum!=a[j])
                        {
                            c++;
                            break;
                        }
                    }
                    }
                    else
                    continue;
                }
            }
            if(c==0)
            System.out.println("-1");
            else
            System.out.println(c/2);
        }
    }
}