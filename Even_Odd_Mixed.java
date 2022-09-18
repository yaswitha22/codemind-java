import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,k=0,t=0;
        a=sc.nextInt();
        while(a!=0)
        {
            int d=a%10;
            t++;
            if(d%2==0)
            c++;
            if(d%2==1)
            k++;
            a/=10;
        }
        if(c==t)
        System.out.print("Even");
        else if(k==t)
        System.out.print("Odd");
        else
        System.out.print("Mixed");
    }
}