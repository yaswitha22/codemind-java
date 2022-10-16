import java.util.Scanner;
class circular
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,d,rev=0,i,c=0,j,k=0,temp=0;
    n=sc.nextInt();
    temp=n;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            c++;
        }
    }
   while(c==2&&n>0)
   {
       d=n%10;
       rev=rev*10+d;
       n=n/10;
   }
   for(j=1;j<=rev;j++)
   {
       if(rev%j==0)
       {
           k++;       }
   }
   if(k==2&&c==2)
   {
       System.out.print("circular prime");
   }
   else if(c==2&&k>2)
   {
       System.out.print("prime but not a circular prime");
   }
   else 
   {
       System.out.print("not prime");
   }
    }
}