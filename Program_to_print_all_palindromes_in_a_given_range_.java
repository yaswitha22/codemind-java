import java.util.Scanner;
class share
{
    public static boolean pal(int n)
    {
        int rev=0,temp;
        temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        if(rev==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
        if(pal(i))
        System.out.print(i+" ");
        else
        continue;
        }
    }
}