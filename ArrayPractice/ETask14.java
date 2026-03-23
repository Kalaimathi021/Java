import java.util.Scanner;

public class ETask14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}