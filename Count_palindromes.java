import java.util.Scanner;
class palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,d,temp=0,a[],c=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            rev=0;
            temp=a[i];
        while(temp>0)
        {
            d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }
        if(rev==a[i])
        c++;
        }
         System.out.print(c);
    }
}