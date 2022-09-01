import java.util.Scanner;
class div
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,arr[],c=0,i;
        n=sc.nextInt();
        k=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int ele:arr)
        {
            if (ele%k!=0)
            {
                c++;
            }
        }
    System.out.println(c);
    }
}