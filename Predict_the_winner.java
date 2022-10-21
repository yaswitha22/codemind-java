import java.util.*;
class predict
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int es=0,os=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            es+=a[i];
            else
            os+=a[i];
        }
        if(((int)Math.abs(es-os))%4==0)
        System.out.print("X");
        else
        System.out.print("Y");
    }
}