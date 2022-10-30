import java.util.*;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        int c=sc.nextInt();
        int d=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=c && c<=b[i])
            {
            d++;
            }
        }
        System.out.print(d);
    }
}