import java.util.Scanner;
class revpal
{
    public static int pal(int n)
    {
        int temp,rev=0;
        temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        return rev;
    }
    public static boolean funj(int n)
    {
        int d,rev=0,temp=n;
       while(n!=0)
       {
        d=n%10;
        rev=rev*10 +d;
        n=n/10;
        }
       if(rev==temp)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
    public static int fun(int n)
    {
        int rev;
        rev=pal(n);
        n+=rev;
        if(funj(n))
        System.out.print(n);
        else
        {
        return fun(n);
        }
    return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        fun(n);
    }
}