import java.util.Scanner;
class ps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,rev=0,c=0;
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i*i==a)
            {
                c=1;
                System.out.print("True");
                break;
            }
        }
        if(c==0)
        System.out.print("False");
    }
}
