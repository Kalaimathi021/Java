import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfixString {
    public static String postfixToInfix(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String b = stack.pop(); 
                String a = stack.pop(); 
                String temp = "(" + a + c + b + ")"; 
                stack.push(temp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String postfix = sc.nextLine();

        String infix = postfixToInfix(postfix);
        System.out.println("Infix form: " + infix);
        sc.close();
    }
}
