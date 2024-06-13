package GeneralPrograms;

public class staticdemo2 
{
	static int i=80;
	static {
		i=10;
	}
	public static void main(String[] args) 
	{
		staticdemo2.i=40;
		System.out.println(staticdemo2.i);
		
	}

}
