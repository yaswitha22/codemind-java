import java.util.Scanner;
class phone
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a,rev=0,c=0;
        a=sc.nextLong();
        while (a!=0)
        {
            long d=a%10;
            rev=rev*10+d;
            c++;
            a/=10;
        }
        if(c==10)
        {
            if(rev%10!=10)
            System.out.print("Valid");
            else
            System.out.print("Invalid");
        }
        else
        System.out.print("Invalid");
    }
}
