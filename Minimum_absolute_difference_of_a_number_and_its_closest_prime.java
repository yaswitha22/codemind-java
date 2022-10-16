import java.util.*;
class diff
{
public static boolean isprime(int num)
{
    int i,fc=0;
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			fc++;	
		}	
	}
	if(fc==2)
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
	int num,pp,np,avg,res,r1,r2;
	float sq;
	num=sc.nextInt();
	if(isprime(num))
	{
	    System.out.print("0");
	}
	else
	{
    	for(pp=num-1;!isprime(pp);pp--);
    	for(np=num+1;!isprime(np);np++);
    	r1=np-num;
    	r2=num-pp;
    	if(r1>r2)
    	{
    	    System.out.print(r2);
    	}
    	else
    	{
    	    System.out.print(r1);
    	}
	}
}
}