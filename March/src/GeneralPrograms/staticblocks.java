package GeneralPrograms;

public class staticblocks 
{
	static {
		System.out.println("helooooooo");
	}
	public static void main(String[] args) 
	{
		System.out.println("hiiiii");
		A a=new A();
		a.m1();
	}
}
class A
{
	static {
		System.out.println("helloo A");
	}
	A()
	{
		System.out.println("a constructor");
	}
	void m1()
	{
		System.out.println("m(1) method");
	}
}
