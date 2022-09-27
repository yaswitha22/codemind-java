import java.util.Scanner;
class lcm
{
    public static boolean pal(int n){
        int rev=0,temp=0;
        temp=n;
        while(n!=0)
            {
                int d=n%10;
                rev=rev*10+d;
                n/=10;
            }
         if(rev==temp)
           return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,k=0;
        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
         int n;
         n=sc.nextInt();
         if(pal(n))
         System.out.println("True");
         else
         System.out.println("False");
           
        }
    }
}