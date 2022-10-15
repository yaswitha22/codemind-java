import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=65;i<=64+n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}