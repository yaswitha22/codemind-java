import java.util.Scanner;
class clothing 
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
            if(a[i]==-1)
            {
                continue;
            }
            else
            {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    a[j]=-1;
                    c++;
                }
            }
            }
            if((c+1)<2)
            continue;
            else
            {
            sum+=((c+1)/2);
            c=0;
            }
        }
        System.out.print(sum);
    }
}