import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,pd=1,sum=0;
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            sum+=d;
            pd*=d;
            n/=10;
        }
        System.out.print(pd-sum);
    }
}