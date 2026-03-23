import java.util.Scanner;
public class StepCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int[] arr = new int[day];
        for (int i = 0; i < day; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < day; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}