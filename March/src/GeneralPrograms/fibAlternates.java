package GeneralPrograms;
import java.util.*;
public class fibAlternates
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=s.nextInt();
		//int u=s.nextInt();
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			if(i%2==0)
			{
				System.out.println(a+" ");
			}
			a=b;
			b=c;
		}
		
	}

}
