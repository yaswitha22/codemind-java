import java.util.Scanner;
class smallfac
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n,sf=1;
            n=sc.nextInt();
            for(int j=1;j<=n;j++)
            {
                sf*=j;
            }
            System.out.println(sf);
        }
    }
}