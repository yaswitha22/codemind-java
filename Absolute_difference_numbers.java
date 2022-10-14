import java.util.Scanner;
class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int temp=n,c=0;
        int ld=n%(int)(Math.pow(10,v));
        while(n!=0)
        {
            int d=n%10;
             c++;
            n/=10;
        }
        int fd=temp/(int)(Math.pow(10,(c-v)));
        System.out.print(Math.abs(fd-ld));
    }
}