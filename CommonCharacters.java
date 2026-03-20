import java.util.Scanner;

public class CommonCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        System.out.print("Common characters: ");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]);

                    // Mark as used
                    arr2[j] = ' ';
                    break;
                }
            }
        }
    }
}