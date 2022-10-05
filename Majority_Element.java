import java.util.Scanner;
class clothing 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,k=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            k=0;
            if(a[i]==-1)
            continue;
            else
            {
             for(int j=0;j<n;j++)
              {
                if(a[i]==a[j]&& i!=j)
                {
                  k++;
                  a[j]=-1;
                }
              }
            }
          if((k+1)>(n/2))
          {
          System.out.print(a[i]);
          break;
          }
        }
    }
}