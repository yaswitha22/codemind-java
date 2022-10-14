import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],ind=0,sum=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==k){
                ind=i;
                break;
            }
        }
        for(int i=0;i<=ind;i++)
        sum+=a[i];
        System.out.print(sum);
    }
}