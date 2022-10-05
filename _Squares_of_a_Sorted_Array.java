import java.util.Scanner;
class clothing 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          k[i]=a[i]*a[i];
        }
        for(int i=0;i<n;i++)
        {
            int temp=0;
            for(int j=i+1;j<k.length;j++)
            {
                if(k[i]>k[j])
                {
                    temp=k[i];
                    k[i]=k[j];
                    k[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(k[i]+" ");
    }
}