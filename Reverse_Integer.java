import java.util.Scanner;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        n=sc.nextInt();
        if(n>0)
        {
            while(n!=0)
            {
                int d=n%10;
                rev=rev*10+d;
                n/=10;
            }
            System.out.print(rev);
        }
        else
        {
            int k=Math.abs(n);
            while(k!=0)
            {
                int d=k%10;
                rev=rev*10+d;
                k/=10;
            }
            System.out.print("-"+rev);
        }
    }
}