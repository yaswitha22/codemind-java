import java.util.Scanner;
class Smaller
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],c=0,k=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                c=1;
                break;
                }
            }
            if(c==0)
            {
                k=1;
            System.out.print(a[i]+" ");
            }
        }
        if(k==0)
        System.out.print("-1");
    }
}