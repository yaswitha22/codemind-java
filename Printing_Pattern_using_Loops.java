import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,l,i,j,m;
    n=sc.nextInt();
    l=2*n-1;
    for(i=0;i<l;i++)
    {
        for(j=0;j<l;j++)
        {
            m=(i>j)?j:i;
            m=(m>l-i-1)?l-i-1:m;
            m=(m>l-j-1)?l-j-1:m;
           System.out.print(n-m+" ");
        }
        System.out.println();
    }
    }
}