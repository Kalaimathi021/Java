package SubArrayPractice;
import java.util.Scanner;
public class SATask13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int left=sc.nextInt();
        int right=sc.nextInt(); 
        int count=0; 
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>=left && sum<=right){
                count++;
            }
            }
        } 
        System.out.println(count);
        sc.close();
    }
}
