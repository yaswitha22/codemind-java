import java.util.Scanner;
class triangle
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}
