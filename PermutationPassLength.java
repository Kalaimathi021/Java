import java.util.Scanner;

public class PermutationPassLength {
    static void permute(int arr[], int index) {
        if(index==arr.length) {
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=index;i<arr.length;i++) {
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            permute(arr,index+1);
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        permute(arr, 0);
    }
}
