import java.util.Scanner;
class valid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0,d;
        while(n!=0)
        {
            d=n%10;
            s+=d;
            n/=10;
            if(n==0 && s>9)
            {
                n=s;
                s=0;
            }
        }
        System.out.print(s);
    }
}