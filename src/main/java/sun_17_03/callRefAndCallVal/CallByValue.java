package sun_17_03.callRefAndCallVal;

public class CallByValue {

	int x;
	
	public void addition(int a)
	{
		x=a+5; 
		System.out.println(x);//15
	}
	
	
	public static void main(String[] args) {
	
		CallByValue cv = new CallByValue();
		
		cv.addition(10);

		System.out.println(cv.x);//15
	}

}
