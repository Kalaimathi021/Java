import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == k){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}
