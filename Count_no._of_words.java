import java.util.Scanner;
class words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String words[]=s1.split(" ");
        System.out.print(words.length);
    }
}