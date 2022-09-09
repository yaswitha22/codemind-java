import java.util.Scanner;
class tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        a=sc.nextInt();
        for(int i=1;i<=a;i+=2)
        {
            System.out.println(n+" x "+ i +" = "+ n*i);
        }
    }
}