package Day4;

public class StringMethodsDemo {

	public static void main(String[] args) {
	
		//lenght()
		
		String s="welcome";
		//int len=s.length();
		System.out.println(s.length());
		
		//concat() - join the strings
		String s1="welcome";
		String s2="to selenium";
		
		System.out.println(s1+s2);
		System.out.println(s1+" "+s2);
		System.out.println("welcome" + "to selenium");
		
		System.out.println(s1.concat(s2));
		System.out.println("welcome".concat("to selenium"));
		
		//trim()
		s="     java programming     ";
		System.out.println(s);
		System.out.println(s.trim());
		 
		//charAt() -- index will start from 0
		
		s="welcome";
		
		System.out.println(s.charAt(5));//m
		System.out.println(s.charAt(2));//l
		
		//contains() --> true/false
		
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("abc"));//false
		
		
		//equals() & equalsIgnoreCase()
		
		s="Welcome";
		
		System.out.println(s.equals("Welcome")); //true
		System.out.println(s.equals("welcome")); //false
		
		
		System.out.println(s.equalsIgnoreCase("Welcome")); //true
		System.out.println(s.equalsIgnoreCase("welcome")); //true
		
		//replace()
		s="welcome to java welcome to selenium";
		
		System.out.println(s.replace('e','a'));//walcoma to java walcoma to salanium
		System.out.println(s.replace('e','a'));
		
		System.out.println(s.replace("welcome","xyz"));//xyz to java xyz to selenium
		
		//substring()
		s="welcome";
		
		System.out.println(s.substring(2,4));//lc
		System.out.println(s.substring(0,4));//welc
		
		//toLowerCase() & toUpperCase()
		
		s="WELCOME";
		System.out.println(s.toLowerCase());//welcome
		
		s="welcome";
		System.out.println(s.toUpperCase());//WELCOME
		
		s="welCOME";
		System.out.println(s.toLowerCase());//welcome
		System.out.println(s.toUpperCase());//WELCOME
		
		
	}

}





