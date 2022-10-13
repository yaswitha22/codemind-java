import java.util.Scanner;
class celsius
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        c=sc.nextInt();
        System.out.printf("%.2f",(c*1.8)+32);
    }
}