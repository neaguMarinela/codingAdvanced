package java_ex;
import java.util.Stack;
import java.util.regex.Pattern;

public class PostfixEvaluation {

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
    
    public int evaluate(String postfixExp) {
    
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();        
        String[] tokens = Pattern.compile("\\s").split(postfixExp);
        
        for (String token : tokens) {
        
            if (isOperand(token)) {
            
                stack.push(Integer.parseInt(token));
            } else {
            
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                
                switch(token) {
                
                    case "+":
                        result = operand1 + operand2;
                        stack.push(result);
                        break;
                        
                    case "-":
                        result = operand1 - operand2;
                        stack.push(result);
                        break;
                    
                    case "*":
                        result = operand1 * operand2;
                        stack.push(result);
                        break;
                        
                    case "/":
                        result = operand2 / operand1;
                        stack.push(result);
                        break;

                    case "^":                        
                        result = operand2^operand1;
                        stack.push(result);
                        break;
                        
                }
            }
        }
        
        return result;
        
    }
    
    public static void main(String[] args) {
        
        PostfixEvaluation pf = new PostfixEvaluation();
        String postFix = "6 2 3 + - 3 8 2 / + * 2";
        System.out.println(pf.evaluate(postFix));
        
        
    }
}
