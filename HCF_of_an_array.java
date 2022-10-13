import java.util.Scanner;
class index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int gcd=0,c=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=1;i<a[n-1];i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%i==0)
                c++;
            }
            if(c==n)
            gcd=i;
        }
        System.out.print(gcd);
    }
}