import java.util.Scanner;
class multiply
{
    public static void main(String y[])
    {
        float a,b,mul;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        mul=a*b;
        System.out.printf("%.2f",mul);
    }
}