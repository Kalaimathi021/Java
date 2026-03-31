package SubArrayPractice;

import java.util.Scanner;

public class SATask5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                String s="";
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    s+=arr[k]+" ";
                }
            int temp=sum;
            while(temp>0 && temp%3==0) {
                temp=temp/3;
            }
            if(temp==1) {
                System.out.println(s);
            }
        }
    }
    }
}
