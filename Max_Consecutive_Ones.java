import java.util.*;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int maxi=0,c=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)  
        {
            if(a[i]==1)
            {
                c++;
            }
            else 
            {
                if(c>maxi)
                {
                maxi=c;
                c=0;
                }
                else
                continue;
            }
        }
        if(a[n-1]==1)
            {
                if(c>maxi)
                maxi=c;
            }
        System.out.print(maxi);
    }
}