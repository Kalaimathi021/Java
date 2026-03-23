import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[size];
        int j = 0;
        for(int i = size - 1; i >= 0; i--){
            temp[j] = arr[i];
            j++;
        }

        
        for(int i = 0; i < size; i++){
            if(arr[i] != temp[i]){
                System.out.print("not palindrome");
                return;
            }
        }

        System.out.print("palindrome");
    }
}