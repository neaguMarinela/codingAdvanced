package sun_17_03.callRefAndCallVal;

public class CallByRef {
	int x;
	public void addition(CallByRef a)
	{
		x=a.x+5; 
		System.out.println(x);//15
	}
	public static void main(String[] args) {
		CallByRef cr=new CallByRef();
		cr.x=10;
		cr.addition(cr);
		System.out.println(cr.x);//15
	}
}
