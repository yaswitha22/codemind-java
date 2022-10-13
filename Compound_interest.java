import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        double ci=0;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        double k=1+(double)r/100;
        ci=p*Math.pow(k,t);
        System.out.printf("%.2f",ci);
    }
}