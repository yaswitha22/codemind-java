import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],c=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++)
        {
            if((a[i]%2==0 && a[i+2]%2==1) || (a[i]%2==1 &&a[i+2]%2==0))
            c++;
        }
        System.out.println(c);
        
    }
}