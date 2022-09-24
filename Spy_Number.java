import java.util.Scanner;
class spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sd=0,pd=1;
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            sd+=d;
            pd*=d;
            n/=10;
        }
        if(sd==pd)
        System.out.print("Spy Number");
        else
        System.out.print("Not Spy Number");
    }
}