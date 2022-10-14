import java.util.Scanner;
class cost
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int c=sc.nextInt();
        int ar=0,nar,nl,nb,tar,cost=0;
        ar=l*b;
        nl=l+(2*w);
        nb=b+(2*w);
        nar=nl*nb;
        tar=nar-ar;
        cost=c*tar;
        System.out.print(cost);
    }
}