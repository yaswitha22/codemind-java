import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,a[],sum=0;
        x=sc.nextInt();
        a=new int[x];
        for(int i=0;i<x;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}