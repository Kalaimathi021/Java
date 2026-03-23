import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr1=new int[size];
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        int k=0;
        for(int i=size-1;i>=0;i--){
            arr2[k]=arr1[i];
            k++;
        }
        for(int i=0;i<size;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
