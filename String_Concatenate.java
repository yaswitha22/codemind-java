import java.util.Scanner;
import java.util.Arrays;
class concatenate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=s1+s2;
       char ch[]=s3.toCharArray();
       Arrays.sort(ch);
       String s4=new String(ch);
        System.out.print(s4);
        
    }
}