import java.util.Scanner;
class pn
{
    public static boolean prime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,rev=0;
        a=sc.nextInt();
        if(prime(a))
        System.out.print("prime");
        else
        System.out.print("not a prime");
    }
}
