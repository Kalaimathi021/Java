import java.util.Scanner;

public class SubsetString {

    static void subset(char arr[], int index, char res[], int size) {
        if (index == arr.length) {
            for (int i = 0; i < size; i++) {
                System.out.print(res[i]);
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

        String input = sc.nextLine();

        char[] arr = input.toCharArray();
        char[] res = new char[arr.length];

        subset(arr, 0, res, 0);
    }
}