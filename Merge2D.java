import java.util.Scanner;

public class Merge2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input 2D array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: convert to 1D array
        int[] result = new int[rows * cols];
        int k = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[k++] = arr[i][j];
            }
        }

        // Step 2: manual sort (Bubble Sort)
        for(int i = 0; i < result.length - 1; i++){
            for(int j = 0; j < result.length - i - 1; j++){
                if(result[j] > result[j+1]){
                    int temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }

        // Step 3: print result
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}