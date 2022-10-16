import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res=0,d;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            res+=Math.pow(d,2);
            n=n/10;
            if(n==0 && res>9)
            {
                n=res;
                res=0;
            }
        }
        if(res==1 || res==7)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}