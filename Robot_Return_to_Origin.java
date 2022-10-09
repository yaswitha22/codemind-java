import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int u=0,d=0,l=0,r=0;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='U')
            {
                u+=1;
            }
            else if(ch=='D')
            {
                d+=1;
            }
            else if(ch=='L')
            {
                l+=1;
            }
            else
            {
                r+=1;
            }
        }
        if((u==d) && (l==r))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    } 
}