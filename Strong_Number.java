import java.util.Scanner;
class strong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,pd=1,sum=0;
        n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            int d=n%10;
            for(int i=1;i<=d;i++)
              pd*=i;
            sum+=pd;
            pd=1;
            n/=10;
        }
        if(sum==temp)
        System.out.print("The number "+temp+" is a strong number");
        else
        System.out.print("The number "+temp+" is not a strong number");
    }
}