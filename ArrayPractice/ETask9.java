import java.util.Scanner;

public class ETask9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                count++;
            }
        }
        System.out.println(count);

sc.close();
    }
}
