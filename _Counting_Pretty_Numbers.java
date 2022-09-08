import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int l,r,d,c=0;
            l=sc.nextInt();
            r=sc.nextInt();
            for(int i=l;i<=r;i++)
            {
                d=0;
                while(i>0)
                {
                    d=i%10;
                    break;
                }
                if(d==2||d==3||d==9)
                c++;
            }
            System.out.println(c);
        }
    }
}