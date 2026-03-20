import java.util.Scanner;

public class LastKSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int sum = 0;

        for (int i = n - k; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of last " + k + " elements = " + sum);

        sc.close();
    }
}