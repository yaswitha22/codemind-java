import java.util.Scanner;
class numbrs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=0;
        char ch=sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==ch)
            {
                k++;
            }
        }
        if(k==0)
        System.out.print("-1");
        else
        System.out.print(k);
    }
}