 import java.util.Scanner;
 class perfect
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int t;
         t=sc.nextInt();
         for(int i=0;i<t;i++)
         {
             int n,c=0;
             n=sc.nextInt();
             for(int j=1;j<=n;j++)
             {
                 if((j*j)==n)
                 {
                     c=1;
                     break;
                 }
             }
             if(c==0)
             System.out.println("False");
             else
             System.out.println("True");
         }
     }
 }