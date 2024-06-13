package GeneralPrograms;

import java.util.Scanner;
public class perfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Numbers");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println(n+"  given number is PERFECTNumber");
		else
			System.out.println(n+"  given Number is NOT PerfectNumber");
		
		
		
		
	}

}
