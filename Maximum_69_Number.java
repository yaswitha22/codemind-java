import java.util.Scanner;
 class perfect
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int t,a[],i=0;
         t=sc.nextInt();
         a=new int[t];
         while(t>0)
         {
             int d=t%10;
             t/=10;
             a[i]=d;
             i++;
         }
         for(int j=i;j>=0;j--)
         {
             if(a[j]==6)
             {
                 a[j]=9;
                 break;
             }
         }
         for(int j=i-1;j>=0;j--)
         System.out.print(a[j]);
     }
 }