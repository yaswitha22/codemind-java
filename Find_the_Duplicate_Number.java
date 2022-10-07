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
     int c=0;
     for(int i=0;i<n;i++)
     {
        c=0;
      for(int j=0;j<n;j++)
      {
          if(i!=j && a[i]==a[j])
           c++;
      }
      if(c==1)
      {
      System.out.print(a[i]);
      break;
      }
      else
      continue;
     }
    }
}