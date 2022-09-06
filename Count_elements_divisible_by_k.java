import java.util.Scanner;
class palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],c=0,k;
        n=sc.nextInt();
        k=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]%k==0)
            c++;
        }
        System.out.print(c);
    }
    
}