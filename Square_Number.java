import java.util.Scanner;
class square
{
    public static boolean num(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i*i+j*j==n)
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(num(n))
        System.out.print("True");
        else
        System.out.print("False");
    }
}