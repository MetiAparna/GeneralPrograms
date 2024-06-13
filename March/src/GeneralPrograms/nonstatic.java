package GeneralPrograms;
class test
{
	{
		System.out.println("heloooo");
	}
	test(){
		System.out.println("one");
	}
	test(int a)
	{
		System.out.println("two");
	}

}
public class nonstatic 
{
	public static void main(String[] args) {
		new test();
		new test(5);
	}
}

