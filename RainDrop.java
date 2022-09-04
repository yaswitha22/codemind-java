import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,c=0;
        x=sc.nextInt();
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                if(i==3)
                {
                c=1;
                System.out.print("Pling");
                }
                else if(i==5)
                {
                c=1;
                System.out.print("Plang");
                }
                else if(i==7)
                {
                c=1;
                System.out.print("Plong");
                }
            }
        }
        if(c==0)
        System.out.print(x);
    }
}