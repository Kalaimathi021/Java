import java.util.Scanner;

public class DisJoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;
        int max = arr[0];          
        int leftMax = arr[0];      

        for(int i = 1; i < size; i++){
            if(arr[i] < leftMax){
                index = i;
                leftMax = max;
            } else {
                max = Math.max(max, arr[i]);
            }
        }

        System.out.println(index + 1);
    }
}