package SubArrayPractice;
import java.util.Scanner;
public class SATask10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        String maxSubArray="";
        int MaxFreq=0;
        int maxElement=-1;   
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int[] freqarr=new int[max+1];
                String s="";
                for(int k=i;k<=j;k++){
                    s+=arr[k]+" ";
                    freqarr[arr[k]]++;
                }
                int Freq=0;
                int element=-1;
                for(int x=0;x<max+1;x++){
                    if(freqarr[x]>Freq){
                        Freq=freqarr[x];
                        element=x;   
                    }
                }
                if(MaxFreq<Freq){
                    MaxFreq=Freq;
                    maxSubArray=s;
                    maxElement=element;   
                }
            }
        }
        System.out.println(maxSubArray);
        System.out.println("Element: "+maxElement);
        System.out.println("Frequency: "+MaxFreq);
        sc.close();
    }
}