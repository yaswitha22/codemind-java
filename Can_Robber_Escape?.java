import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,o=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                o++;
            }
        }
        if(o<=2)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}