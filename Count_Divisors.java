import java.util.Scanner;
class divisors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,k,r,c=0;
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
           c++;
            }
            else
            continue;
            
        }
        System.out.print(c);
    }
}