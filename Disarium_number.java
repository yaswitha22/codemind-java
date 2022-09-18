import java.util.Scanner;
class disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,temp,c=0;
        n=sc.nextInt();
        temp=n;
        int temp1=n;
        while(n!=0)
        {
            int d=n%10;
            c++;
            n/=10;
        }
        while(temp!=0)
        {
            int d=temp%10;
            sum+=Math.pow(d,(c--));
            temp/=10;
        }
        if(sum==temp1)
        System.out.print("True");
        else
        System.out.print("False");
    }
}
