import java.util.Scanner;
public class Frequencyofk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        for(int i=0;i<size;i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.print(count);
    }
}
