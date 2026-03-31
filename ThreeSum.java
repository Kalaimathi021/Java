import java.util.Scanner;
public class ThreeSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int sum=0;
        for(int i=0;i<size-3;i++){
            for(int j=i+1;j<size-2;j++){
                for(int k=j+1;k<size-1;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum==target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
                sum=0;
            }
        }
    }
}
