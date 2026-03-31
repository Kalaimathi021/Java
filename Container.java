import java.util.Scanner;
public class Container {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int maxArea=0;
        int min=0;
        while (left<right) {
            if(arr[left]<arr[right]){
                min=arr[left];
            }else{
                min=arr[right];
            }
            int width=right-left;
            int area=width*min;
            if(area>maxArea){
                maxArea=area;
            }
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxArea);
    }
}
