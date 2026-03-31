package SubArrayPractice;

import java.util.Scanner;

public class SATask9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            for(int j=i;j<size;j++) {
                int pro=1;
                for(int k=i;k<=j;k++){
                    pro*=arr[k];
                }
                if(pro>max){
                    max=pro;
                }
            }
    }
    System.out.println(max);
    sc.close();
}
}
