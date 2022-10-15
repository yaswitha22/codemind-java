import java.util.Scanner;
class adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,rev=0,rev1=0;
        int sq=n*n;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        int sq1=rev*rev;
        while(sq1!=0)
        {
            int d=sq1%10;
            rev1=rev1*10+d;
            sq1/=10;
        }
        if(rev1==sq)
        System.out.print("True");
        else
        System.out.print("False");
    }
}