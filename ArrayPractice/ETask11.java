import java.util.Scanner;

public class ETask11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr1= new int[size];
        int[] arr2=new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
            arr2[i]=arr1[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
