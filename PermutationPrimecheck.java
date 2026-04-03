import java.util.Scanner;

public class PermutationPrimecheck {
    static int max=Integer.MIN_VALUE;
    static void permute(int arr[], int index) {
        if(index==arr.length) {
             int num=0;
            for(int i=0;i<arr.length;i++){
                num=num*10+arr[i];
            }
            if(isPrime(num)){
                max=Math.max(max, num);
            }
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
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        permute(arr, 0);
        if(max==Integer.MIN_VALUE){
            System.out.println("No prime");
        }else{
            System.out.println(max);
        }
}
}
