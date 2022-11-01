import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            int d=0;
            sc.nextLine();
            String s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(Character.isDigit(s.charAt(i)))
                {
                    d+=1;
                }
            }
            if(d>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        n=n-1;
    }
}