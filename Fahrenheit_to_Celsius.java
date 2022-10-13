import java.util.Scanner;
class fahrenheit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int fa;
        fa=sc.nextInt();
        System.out.printf("%.2f",(fa-32)*(float)5/9);
    }
}