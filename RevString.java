import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
       /* int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));*/
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
