package GeneralPrograms;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Number");
		int n=s.nextInt();
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
		
	}

}
