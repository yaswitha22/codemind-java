import java.util.Scanner;
class palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        double t;
        c=sc.nextInt();
        t=32+(c*9.0/5);
        System.out.printf("%.2f",t);
    }
}