import java.util.Scanner;

public class ETask7sub1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int first = 0;
        int last = size - 1;

        while(first < last){
            if(arr[first] == arr[last]){
                first++;
                last--;
            } else {
                System.out.println("Not Palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
        sc.close();
    }
}