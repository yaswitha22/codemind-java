import java.util.Scanner;
class si
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int k=n*(n-3)/2;
        System.out.print(k);
    }
}