import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],ind=0,sum=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        }
        else
        {
        for(int i=0;i<n;i++)
        {
             System.out.print(a[i]+" ");
        }
        System.out.print("0");
        }
    }
}