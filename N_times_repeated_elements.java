import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],c=0,t=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            c=0;
            if(a[i]==-1)
            continue;
            else
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i]==a[j]&&i!=j)
                    {
                        a[j]=-1;
                    c++;
                    }
                }
            }
            if((c+1)==k)
            {
                t++;
            System.out.print(a[i]+" ");
            }
        }
        if(t==0)
        System.out.print("-1");
    }
}