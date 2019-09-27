package java_ex;
import java.util.Stack;
import java.util.regex.Pattern;

public class InfixConverter {
 
    public static boolean isOperand(String s)
    {
      double a=0;
      try
      {
        a=Double.parseDouble(s); 
      }
      catch (Exception exception)
      {
        return false;
      }
      return true;
    }

    public static boolean isOperator(String s)
    {
      String operatorList="+-*/^";
      return operatorList.contains(s); // indexOf(s)>=0;
    }
    
    enum Operator {
    
        MINUS(1), PLUS(1), MULTIPLY(2), DIVIDE(2), EXPONENT(3);
        
        private final int precedence;

        private Operator(int precedence) {
            this.precedence = precedence;
        }
    }
    
    public int getPrecedence(String operator) {
    
        int operatorPrecedence = 0;
        
        if (operator.equals("+")) {
        
            operatorPrecedence = Operator.PLUS.precedence;
        
        } else if (operator.equals("-")) {
        
            operatorPrecedence = Operator.MINUS.precedence;
        
        } else if (operator.equals("*")) {
        
            operatorPrecedence = Operator.MULTIPLY.precedence;
        
        } else if (operator.equals("/")) {
        
            operatorPrecedence = Operator.DIVIDE.precedence;
        }
        
        return  operatorPrecedence;
    }
    
    public String convert(String infix) {
    
        Stack<String> stack = new Stack<String>();
        
        String postFix = "";
        String space = " ";
        
        String[] tokens = Pattern.compile("\\s").split(infix);
        
        for (String token : tokens) {
        
            if (isOperand(token)) {
            
                postFix += token + space;
                
            } else if (token.equals("(")) {
            
                stack.push(token);
            
            } else if (isOperator(token)) {
            
                while ( !stack.empty() && getPrecedence(stack.peek()) >= getPrecedence(token)) {
                
                    postFix += stack.pop() + space;
                }
                
                stack.push(token);
            
            } else if (token.equals(")")) {
            
                while (!stack.peek().equals("(")){
                
                    postFix += stack.pop() + space;
                }
                stack.pop(); // Opening bracket
            }
        }
        
        while(!stack.empty()) {
        
            postFix += stack.pop() + space;
        }
        
        return postFix;
        
    }

    public static void main(String[] args) {
        
        InfixConverter inf = new InfixConverter();
        
        String infix = "2 + 3 * 4";
        System.out.println("Infix : "+ infix);
        System.out.println("Postfix : " + inf.convert(infix));
        System.out.println("");
        
        String infix2 = "2 * ( 6 + 2 * 4 ) * 5 - 8 / 4";
        System.out.println("Infix : "+ infix2);
        System.out.println("Postfix : " + inf.convert(infix2));
        System.out.println("");
        
        String infix3 = "3 * 4 + ( 3 + 2 + 5 ) / 2";
        System.out.println("Infix : "+ infix3);
        System.out.println("Postfix : " + inf.convert(infix3));
        System.out.println("");
        
    }
}
