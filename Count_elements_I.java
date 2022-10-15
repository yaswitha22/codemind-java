import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        a.add(sc.nextInt());
        for(int i=0;i<m;i++)
        b.add(sc.nextInt());
        HashSet<Integer> hs1=new HashSet<Integer>(a);
        HashSet<Integer>hs2=new HashSet<Integer>(b);
        for(int i:hs1)
        {
            for(int j:hs2)
            {
                if(i==j)
                {
                c++;
                break;
                }
            }
        }
        System.out.print(c);
    }
}