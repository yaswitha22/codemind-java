import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j,sum=0,c=0;
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=0;j<n;j++)
        {
            if(a[i]==a[j])
            {
                c++;
                if(c==1)
                {
                    if(a[i]%2==1)
                    {
                        sum+=a[i];
                    }
                }
                if(j > i)
               a[j] = 0;
            }
        }
    }
    System.out.print(sum);
    }
}