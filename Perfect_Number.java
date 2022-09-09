import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if (n%i==0)
            sum+=i;
        }
        if(n==sum)
        System.out.print("True");
        else
         System.out.print("False");
    }
}