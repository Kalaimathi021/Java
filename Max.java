import java.util.Scanner;
import java.util.Stack;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Compute left smaller
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            leftSmaller[i] = stack.isEmpty() ? 0 : arr[stack.peek()];
            stack.push(i);
        }

        // Clear stack for right smaller
        stack.clear();

        // Compute right smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            rightSmaller[i] = stack.isEmpty() ? 0 : arr[stack.peek()];
            stack.push(i);
        }

        // Compute max absolute difference
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(leftSmaller[i] - rightSmaller[i]);
            if (diff > maxDiff) maxDiff = diff;
        }

        System.out.println("Maximum absolute difference: " + maxDiff);
    }
}