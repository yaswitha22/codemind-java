import java.util.Scanner;
class sort
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,a[];
    n=sc.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    for(int j=n-1;j>=1;j--)
    {
    if(a[i]==1 && a[j]==0 && i<j)
    {
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    }
    else 
        continue;
    }
    }
    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
}
}