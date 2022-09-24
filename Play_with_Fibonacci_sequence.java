import java.util.Scanner;
class sort
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,a=0,b=1,c=0;
    n=sc.nextInt();
    System.out.print(a+" ");
    for(int i=1;i<n;i++)
    {
        c=a+b;
        a=b;
        b=c;
        System.out.print(a+" ");
    }
}
}