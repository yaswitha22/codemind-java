import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="AEIOUaeiou";
        String s2="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int vc=0,co=0,dg=0,ws=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s1.contains(ch+""))
               vc++;
            else if(s2.contains(ch+""))
                co++;
            else if(ch>='0'&&ch<='9')
            dg++;
            else if((int)ch==32)
            ws++;
        }
        System.out.println("Vowels: "+vc);
        System.out.println("Consonants: "+co);
        System.out.println("Digits: "+dg);
        System.out.println("White spaces: "+ws);
    }
}