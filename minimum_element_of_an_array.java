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
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        System.out.print(min);
    }
}