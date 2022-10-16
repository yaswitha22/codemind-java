import java.util.Scanner;
class closest
{
    public static boolean ispal(int n)
    {
    int d,res=0,temp;
    temp=n;
    while(n!=0)
    {
        d=n%10;
        res=res*10+d;
        n=n/10;
    }
    if(temp==res)
    {
        return true;
    }
    else
    {
        return false;
    }
   }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	int n,pp,np;
	n=sc.nextInt();
	for(pp=n-1;;pp-=1)
	{
		if(ispal(pp))
		{
			break;
		}
	}
	for(np=n+1;;np+=1)
	{
		if(ispal(np))
		{
			break;
		}
	}
	if(n-pp>np-n)
	{
	 System.out.print(np);
	}
	if(n-pp<np-n)
	{
		System.out.print(pp);
	}
	if(n-pp==np-n)
	{
		System.out.print(pp+" "+np);
	}
}
}