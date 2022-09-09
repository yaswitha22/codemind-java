import java.util.Scanner;
class palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp=0,rev=0;
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(temp==rev)
        System.out.print("True");
        else
        System.out.print("False");
    }
}