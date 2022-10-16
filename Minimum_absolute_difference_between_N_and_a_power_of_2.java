import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,i,x=0,l,u;
    n=sc.nextInt();
    for(i=1;i<n;i++)
    {
        x=(int)Math.pow(2,i);
        if(n<=x)
        {
            break;
        }
    }
    l=(int)Math.pow(2,i-1);
    u=(int)Math.pow(2,i);
    if(n==x)
    {
        System.out.print("0");
    }
    else if(n-l>u-n)
    {
        System.out.print(u-n);
    }
    else
    {
        System.out.print(n-l);
    }
}
}