import java.util.Scanner;
class ammicable
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,sum=0,sum1=0,m,i;
   n=sc.nextInt();
   m=sc.nextInt();
    for(i=1;i<n&&i<m;i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
        if(m%i==0)
        {
            sum1+=i;
        }
    }
   if(sum1==n&&sum==m)
   {
       System.out.print("Amicable");
   }
   else
   {
       System.out.print("Not Amicable");
   }
    }
}