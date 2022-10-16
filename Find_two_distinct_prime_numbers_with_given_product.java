import java.util.Scanner;
class distinct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,a=1,b=1,i,c=0,ct=0,p=1,temp=0;
    n=sc.nextInt();
    temp=n;
    for(i=1;i<n;i++)
    {
        if(n%i==0&&n>2)
        {
            c=i;
            a=b;
            b=c;
        }
        p=a*b;
        if(p==temp)
        {
            ct++;
            System.out.print(a+" "+b);
            break;
        }
    }
    if(ct==0)
    {
        System.out.print("-1");
    }
    }
}