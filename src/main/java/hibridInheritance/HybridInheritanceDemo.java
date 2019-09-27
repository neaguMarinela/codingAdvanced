package hibridInheritance;

class A1
{
	void m1()
	{
		System.out.println("This is m1 from A1....");
	}
}
interface B1
{
	void m2();
}
interface B2
{
	void m3();
}
public class HybridInheritanceDemo extends A1 implements B1,B2
{
	public void m2()
	{
		System.out.println("This is m2 from B1.....");
	}
	public void m3()
	{
		System.out.println("This is m3 from B2.....");
	}
	public static void main(String[] args) {
		HybridInheritanceDemo hi=new HybridInheritanceDemo();
		hi.m1();
		hi.m2();
		hi.m3();
		
	}

}
