import java.util.Scanner;
class si
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        int simple=0;
        simple=(p*t*r)/100;
        System.out.print(simple);
    }
}