import java.util.Scanner;

public class LongestSubstring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String longest = "";

        // Outer loop - starting point
        for (int i = 0; i < str.length(); i++) {

            String temp = "";

            // Inner loop - build substring
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);

                // check if character already exists in temp
                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                // update longest
                if (temp.length() > longest.length()) {
                    longest = temp;
                }
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
