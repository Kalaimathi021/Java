package SubArrayPractice;

import java.util.Scanner;

public class SATask14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int minsum=Integer.MAX_VALUE;
        String str="";
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int sum=0;
                String s="";
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    s+=arr[k]+" ";
                    
                }
                if(Math.abs(sum) < Math.abs(minsum)){
                    str=s;
                    minsum=sum;
                }
            }
        }
        System.out.println(str);
        System.out.println("Minimum sum: "+minsum);
        sc.close();
    }
}
