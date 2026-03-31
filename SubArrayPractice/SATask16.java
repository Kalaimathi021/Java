package SubArrayPractice;
import java.util.Scanner;
public class SATask16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int max=0;
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int kth=sc.nextInt();
        int actualcount=0;
        for(int i=0;i<size;i++){
            int[] freq=new int[max+1];
            int count=0;
            for(int j=i;j<size;j++){
                if (freq[arr[j]] == 0) {
                    count++;           
                }
                freq[arr[j]]++;
                if (count == kth) {
                    actualcount++;
                }
            
            }
        }
        System.out.println(actualcount);
        sc.close();
    }
}
