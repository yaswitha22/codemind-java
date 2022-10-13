import java.util.Scanner;
class index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int ei=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                ei=i;
            }
        }
        System.out.print(ei);
    }
}