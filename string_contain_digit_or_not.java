import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int dg=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9')
            dg++;
        }
        if(dg==0)
         System.out.println("Doesn't contain digit");
        else
        System.out.println("Contains "+dg+" digit");
    }
}