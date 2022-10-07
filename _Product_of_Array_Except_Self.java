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
     int pd=1;
     for(int i=0;i<n;i++)
     {
         pd=1;
      for(int j=0;j<n;j++)
      {
          if(i!=j)
           pd*=a[j];
      }
      System.out.print(pd+" ");
     }
    }
}