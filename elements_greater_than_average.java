import java.util.*;
class ele
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>=(sum/n))
            c++;
        }
        System.out.print(c);
    }
}