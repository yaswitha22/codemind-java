import java.util.Scanner;
class profile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,l;
        l=sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int w,h;
            w=sc.nextInt();
            h=sc.nextInt();
            if(w<l || h<l)
            System.out.println("UPLOAD ANOTHER");
            else if(w>=l && h>=l)
            {
                if(w==h)
                System.out.println("ACCEPTED");
                else
                System.out.println("CROP IT");
            }
        }
    }
}