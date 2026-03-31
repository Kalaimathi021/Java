/*import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int sum=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
            sum=0;
        }
    }
}*/
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found");
    }
}
