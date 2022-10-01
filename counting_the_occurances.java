import java.util.Scanner;
class occurances
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
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