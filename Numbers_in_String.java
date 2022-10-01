import java.util.Scanner;
class numbrs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                c+=(ch-'0');
            }
        }
        System.out.print(c);
    }
}