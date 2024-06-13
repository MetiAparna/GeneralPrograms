package GeneralPrograms;

import java.util.Scanner;

public class FibRange
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Numbers");
		int l=s.nextInt();
		int u=s.nextInt();
		int a=0,b=1,c=0;
		for(;true;)
		{
			c=a+b;
			if(u<=a)
				break;
			if(l<=a)//range of fibb
			{
				//if(a%2==0)even fibonacci only print in the limit
				System.out.print(a+" ");
			}
			a=b;
			b=c;
		}
		
	}

}
