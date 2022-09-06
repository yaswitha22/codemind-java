import java.util.Scanner;
class ascending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],c=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            continue;
            else
            {
                c=1;
                break;
            }
        }
        if(c==1)
        System.out.print("no");
        else
        System.out.print("yes");
        }
}