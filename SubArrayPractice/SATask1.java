package SubArrayPractice;

import java.util.Scanner;

public class SATask1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int max=0;
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int maxbeauty=0;

        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int[] freq=new int[max+1];
                for(int k=i;k<=j;k++){
                    freq[arr[k]]++;
                }
                int maxFreq=0;
                int minFreq=Integer.MAX_VALUE;
                for(int x=0;x<max+1;x++){
                    if(freq[x]>0){
                        if(freq[x]>maxFreq){
                            maxFreq=freq[x];
                        }
                        if(freq[x]<minFreq){
                            minFreq=freq[x];
                        }
                    }
                }
                int beauty=maxFreq-minFreq;

                if(beauty>maxbeauty){
                    maxbeauty=beauty;
                }
            }
        }
        System.out.println(maxbeauty);



    }

}
