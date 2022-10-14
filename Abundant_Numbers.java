import java.util.Scanner;
class smaple
{
    public static boolean abun(int n)
    {
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c+=i;
            }
        }
        if(c>n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(abun(n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}