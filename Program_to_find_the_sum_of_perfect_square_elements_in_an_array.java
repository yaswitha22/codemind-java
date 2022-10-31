import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int sq=(int)Math.sqrt(a[i]);
            if(sq*sq==a[i])
            {
                sum+=a[i];
            }
        }
        System.out.print(sum);
    }
}