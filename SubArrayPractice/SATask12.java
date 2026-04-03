package SubArrayPractice;
import java.util.Scanner;
public class SATask12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=0;
        String maxsubarr="";
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                boolean isIncreasing=true;
                int sum=arr[i];
                String s=arr[i]+" ";
                for(int k=i;k<j;k++){
                    if(arr[k]<arr[k+1]){
                        sum+=arr[k+1];
                        s+=arr[k+1]+" ";
                    }else{
                        isIncreasing=false;
                        break;
                    }
                }
                if(isIncreasing&&sum>maxsum){
                    maxsum=sum;
                    maxsubarr=s;
                }
            }
        }
        System.out.println(maxsum);
        System.out.println(maxsubarr);
    }
}