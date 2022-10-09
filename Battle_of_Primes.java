import java.util.Scanner;
class fact
{
    public static boolean prime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=c;
        while(true)
        {
            d+=1;
            if(prime(d))
            {
                System.out.print(d-c);
                break;
            }
        }
    }
}