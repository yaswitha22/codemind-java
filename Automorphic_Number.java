import java.util.Scanner;
class automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,d,sq=0,rev=0,temp=0,temp1=0,c=0,d1,k=0,p;
    n=sc.nextInt();
    temp=n;
    sq=n*n;
    temp1=0;
    while(n!=0)
    {
        d=n%10;
        c++;
        n=n/10;
    }
    while(sq!=0)
    {
        p=(int)Math.pow(10,c);
        d1=sq%p;
        if(d1==temp)
        {
            System.out.print("Automorphic Number");
            k++;
            break;
        }
        sq=sq/10;
    }
    if(k==0)
    {
        System.out.print("Not an Automorphic Number");
    }
}
}