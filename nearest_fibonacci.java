import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,a=0,b=1,c,j=0,i,arr[];
    n=sc.nextInt();
    arr=new int[n];
    for(i=1;i<=n;i++)
    {
        arr[j]=a;
        c=a+b;
        a=b;
        b=c;
        j++;
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]>n)
        {
            break;
        }
    }
    if(n-arr[i-1] == arr[i]-n)
    {
        System.out.print(arr[i-1]+" "+arr[i]);
    }
    else if(n-arr[i-1] > arr[i]-n)
    {
        System.out.print(arr[i]);
    }
    else
    {
        System.out.print(arr[i-1]);
    }
    }
}