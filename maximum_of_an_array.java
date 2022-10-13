import java.util.Scanner;
class search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int max=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.print(max);
    }
}