import java.util.Scanner;
class search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
            c++;
            }
        }
        System.out.println(c);
    }
}