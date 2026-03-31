import java.util.Scanner;

public class Subset {

    static void subset(int arr[], int index, int res[], int size) {
        if (index == arr.length) {
            for (int i = 0; i < size; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            return;
        }
        res[size] = arr[index];
        subset(arr, index + 1, res, size + 1);
        subset(arr, index + 1, res, size);
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();   
        int index = 0;

        int[] arr = new int[size]; 
        int[] res = new int[size]; 
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        subset(arr, index, res, 0); 
    }
}