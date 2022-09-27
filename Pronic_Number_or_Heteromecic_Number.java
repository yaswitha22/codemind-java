import java.util.Scanner;
class pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                c=1;
                System.out.print("YES");
                break;
            }
        }
        if(c==0)
        System.out.print("NO");
    }
}