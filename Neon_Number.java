import java.util.Scanner;
class spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq=0,sd=0;
        n=sc.nextInt();
        sq=n*n;
        while(sq!=0)
        {
            int d=sq%10;
            sd+=d;
            sq/=10;
        }
        if(sd==n)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}