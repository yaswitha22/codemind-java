import java.util.Scanner;
class search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        int avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
            c=1;
            System.out.print("True");
            break;
            }
        }
        if(c==0)
        System.out.printf("False");
    }
}