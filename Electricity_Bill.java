import java.util.Scanner;
class season
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        String id,s;
        id=sc.nextLine();
        s=sc.nextLine();
        n=sc.nextInt();
        if(n<=199)
        System.out.printf("%.2f",n*1.20+100);
        else if(n>=200&&n<400)
        {
            if(n*1.50>400)
            {
                 System.out.printf("%.2f",(n*1.50)+(0.15*(n*1.50)));
            }
            else
            {
                System.out.printf("%.2f",n*1.5+100);
            }
        }
        else if(n>=400&&n<600)
        {
          double d=(n*1.80)+(0.15*(n*1.80));
            System.out.printf("%.2f",d);
        }
        else if(n>=600)
        {
            double d=(n*2.00)+(0.15*(n*2.00));
            System.out.printf("%.2f",d);
        }
    }
}