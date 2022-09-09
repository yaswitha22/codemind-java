import java.util.Scanner;
class palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,rev=0;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==temp)
        System.out.print("2");
        else
        System.out.print("1");
        sc.close();
    }
}