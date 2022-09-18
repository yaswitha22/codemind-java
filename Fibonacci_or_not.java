import java.util.Scanner;
class fibonnaci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            if(c==n)
            {
                System.out.print("True");
                break;
            }
            if(c>n)
            {
                System.out.print("False");
                break;
            }
            a=b;
            b=c;
        }
    }
}
