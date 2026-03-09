import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String str1 = new StringBuilder(str).reverse().toString();
        
        System.out.println(str1);
        sc.close();
    }
}
