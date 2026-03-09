import java.util.Stack;
import java.util.Scanner;
public class PostfixEvaluation {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack=new Stack<>();

        for (int i=0;i<exp.length();i++) {
            char c=exp.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c-'0');  
            } else {
                int val2=stack.pop();
                int val1=stack.pop();

                switch (c) {
                    case '+': stack.push(val1+val2); 
                        break;
                    case '-': stack.push(val1-val2); 
                        break;
                    case '*': stack.push(val1*val2); 
                        break;
                    case '/': stack.push(val1/val2); 
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.next(); 
        System.out.println(evaluatePostfix(exp));
        sc.close();
    }
}