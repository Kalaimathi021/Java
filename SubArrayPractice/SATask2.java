package SubArrayPractice;

import java.util.Scanner;

public class SATask2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int kth=sc.nextInt();
        int count=0;
        int sum=0;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum%kth==0){
                    count++;
                }
                sum=0;
            }
        }
        System.out.println(count);
    }
}
