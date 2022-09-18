import java.util.Scanner;
class hcf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,gcd=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            gcd=i;
        }
        System.out.print(gcd);
    }
}
