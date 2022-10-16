import java.util.Scanner;
class candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int k=sc.nextInt();
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        for(int i=0;i<n;i++)
        {
            if((a[i]+k)>=max)
            System.out.print("True"+" ");
            else 
            System.out.print("False"+" ");
        }
    }
}