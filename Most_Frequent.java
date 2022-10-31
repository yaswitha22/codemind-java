import java .util.*;
class frequent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,val=0,max=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j]&&i!=j)
                {
                    c++;
                }
            }
            if((c+1)>max)
            {
                max=c+1;
                val=a[i];
            }
            else if((c+1)==max)
            {
                if(a[i]<val)
                {
                    val=a[i];
                }
            }
        }
        System.out.print(val);
    }
}