package SubArrayPractice;

import java.util.Scanner;

public class SATask4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int kth=sc.nextInt();
        int maxcount=0;
        String longsubarr="";
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int count=0;
                String s="";
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    s+=arr[k]+" ";
                    count++;
                }
                if(count>maxcount && kth!=0 && sum%kth==0){
                    longsubarr=s;
                    maxcount=count;
                }
            }
        }
        System.out.println(longsubarr);

        sc.close();
    }
}
