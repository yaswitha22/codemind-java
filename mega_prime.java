import java.util.Scanner;
class lcm
{
    public static boolean prime(int n){
        if(n<2)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,k=0;
        a=sc.nextInt();
        if(prime(a))
        {
            while(a!=0)
            {
                int d=a%10;
                c++;
                if(prime(d))
                    k++;
                else
                    break;
                a/=10;
            }
            if(c==k)
            System.out.print("Mega Prime");
            else
            System.out.print("Not Mega Prime");
        }
        else
        {
        System.out.print("Not Mega Prime");
        }
    }
}