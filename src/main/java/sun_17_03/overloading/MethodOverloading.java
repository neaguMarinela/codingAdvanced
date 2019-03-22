package sun_17_03.overloading;

public class MethodOverloading {
	int x,y;
	double z;
	int addition() //1
	{
		x=10;
		y=20;
		return(x+y);
	}
	int addition(int a, int b)//2
	{
		x=a;
		y=b;
		return(x+y);
	}
	double addition(int a, double b)//3
	{
		x=a;
		z=b;
		return(x+z);
	}
	double addition(int a,int b, double c)//4
	{
		x=a;
		y=b;
		z=c;
		return(x+y+z);
	}
	
	void main()
	{
		System.out.println("This is main method.....");
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.addition());//1
		System.out.println(mo.addition(100,200));//2
		System.out.println(mo.addition(100,20.5));//3
		System.out.println(mo.addition(100,200,10.5));//4
		mo.main();//call main method
	}
}
