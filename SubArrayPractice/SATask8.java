package SubArrayPractice;

import java.util.Scanner;
public class SATask8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int max=0;
        String maxSubArray="";
        for(int i=0;i<size;i++) {
            for(int j=i;j<size;j++) {
                String s=arr[i]+" ";
                int count=1;
                boolean isArithmetic=true;
                int diff=0;
                if(j>i){
                    diff=arr[i+1]-arr[i];
                }
                for(int k=i+1;k<=j;k++){
                    if(arr[k]-arr[k-1]!=diff) {
                        isArithmetic=false;
                        break;
                    }
                    s+=arr[k]+" ";
                    count++;
                }
                if (isArithmetic&&count>max) {
                    max=count;
                    maxSubArray=s;
                }
            }
        }

        System.out.println(maxSubArray);
        sc.close();
    }
}