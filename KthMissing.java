import java.util.Scanner;

public class KthMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int missingCount = 0;
        int current = 1;
        int i = 0;

        while (missingCount < k) {
            if (arr[i] == current) {
                i++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    System.out.println("Kth Missing Element: " + current);
                    break;
                }
            }
            current++;
        }

        sc.close();
    }
}