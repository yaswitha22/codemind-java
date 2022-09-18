import java.util.Scanner;
class primepal
{
    public static boolean pal(int n)
    {
        int rev=0,temp;
        temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        if(rev==n)
        return true;
        else
        return false;
    }
    public static boolean prime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(pal(i)&&prime(i))
            {
            System.out.print(i);
            break;
            }
            else
            continue;
            
        }
    }
}