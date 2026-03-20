import java.util.Scanner;
public class LongestSubstring{

    // Function to check if substring has duplicate characters
    static boolean hasDuplicate(char[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.toCharArray();

        int maxLength = 0;
        String longest = "";

        // Generate all substrings
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                // Check if current substring has duplicates
                if (!hasDuplicate(arr, i, j)) {

                    int length = j - i + 1;

                    if (length > maxLength) {
                        maxLength = length;

                        // Build substring manually
                        String temp = "";
                        for (int k = i; k <= j; k++) {
                            temp += arr[k];
                        }

                        longest = temp;
                    }
                }
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLength);
    }
}