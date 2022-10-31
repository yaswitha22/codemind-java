import java .util.*;
class frequent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int sum=0,sum1=0;
        for(int i=0;i<3;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<3;i++)
        b[i]=sc.nextInt();
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                sum++;
            }
            else if(b[i]>a[i])
            {
                sum1++;
            }
        }
        System.out.print(sum+" "+sum1);
    }
}