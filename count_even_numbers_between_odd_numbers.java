import java.util.Scanner;
class index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n-2;i++)
        {
            if(a[i]%2==1 && a[i+2]%2==1 && a[i+1]%2==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}