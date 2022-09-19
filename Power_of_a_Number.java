import java.util.Scanner;
class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.print((int)(Math.pow(a,b))%c);
    }
}