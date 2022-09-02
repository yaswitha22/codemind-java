import java.util.Scanner;
class cars
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,x1,x2,y1,y2;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            double car1=(double)y1/x1;
            double car2=(double)y2/x2;
            if(car1<car2)
            System.out.println("-1");
            else if(car2<car1)
            System.out.println("1");
            else if(car1==car2)
            System.out.println("0");
        }
        sc.close();
    }
}