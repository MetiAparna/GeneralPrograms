package relationship.com;
class A
{
	void m1()
	{
		System.out.println("hiiiiiiiiiiii");
	}
}
class B
{
	A a;
	B(A a)
	{
		this.a=a;
		System.out.println("B constructor");
	}
	void m2()
	{
		System.out.println("m2 in class b");
		a.m1();
	}
}
public class composition 
{
	public static void main(String[] args) 
	{
		B b=new B(new A());
		b.m2();
		
	}

}
