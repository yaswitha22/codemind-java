import java.util.*;
class character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int c1=0,h=0;
            for(int j=0;j<s.length();j++)
            {
                c1=0;
                for(int k=0;k<s.length();k++)
                {
                    if(s.charAt(j)==s.charAt(k)&& j!=k)
                    {
                        c1=1;
                        break;
                    }
                }
                if(c1==1)
                {
                  continue;
                }
                else
                {
                    h=1;
                    System.out.println(s.charAt(j));
                    break;
                }
                
            }
            if(h==0)
            System.out.println(-1);
        }
    }
}