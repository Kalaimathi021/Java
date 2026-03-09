import java.util.Scanner;
import java.util.Stack;

public class PairwiseDestruction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] arr=input.split(" ");
        Stack<String> stack=new Stack<>();
        for (int i=0;i<arr.length;i++) {
            if (!stack.isEmpty()&&stack.peek().equals(arr[i])) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
    }
    System.out.println(stack.size());
}
}