import java.util.Scanner;
class share
{
    public static boolean prime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
        if(prime(i))
        {
        c++;
        }
        else
        continue;
        }
        System.out.print(c);
    }
}