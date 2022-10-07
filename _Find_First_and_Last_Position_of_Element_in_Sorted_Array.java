import java.util.Scanner;
class elements
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     int k=sc.nextInt();
     int fi=-1,li=-1;
     for(int i=0;i<n;i++)
     {
         if(a[i]==k && fi==-1)
         {
             fi=i;
         }
         if(a[i]==k && fi!=-1)
         {
             li=i;
         }
     }
     if(fi==-1 && li==-1)
     System.out.print("-1 -1");
     else
     System.out.print(fi+" "+li);
    }
}