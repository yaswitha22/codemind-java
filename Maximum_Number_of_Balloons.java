import java.util.*;
import java.lang.*;
class maxnumberofballons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        System.out.println(max(s));
    }
    public static int max(String str)
    {
        int b = 0 , a = 0 , l = 0 ,  o = 0 , n = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            char chr = str.charAt(i);
            switch(chr)
            {
                case 'b' : b++;
                break;
                case 'a' : a++;
                break;
                case 'l' : l++;
                break;
                case 'o' : o++;
                break;
                case 'n' : n++;
                break;
                default: ;
            }
        }
        l =l/2;
        o =o/2;
        return Math.min(b , Math.min(a , Math.min(l, Math.min(o , n))));
    }
}