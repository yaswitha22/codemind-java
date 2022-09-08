import java.util.Scanner;
class evedig
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
            k=0;
            while(a[i]>0)
            {
               int d=a[i]%10;
                k++;
                a[i]/=10;
            }
            if(k%2==0)
            c++;
        }
        System.out.println(c);
    }
}