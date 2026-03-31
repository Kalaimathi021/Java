import java.util.Scanner;
public class TargetSum {
    static void target(int arr[],int index,int t,int res[],int size) {
        if (t==0) {   
            for (int i=0;i<size;i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }
        if (t<0 || index==arr.length) return; 
           res[size]=arr[index];  
            target(arr,index+1,t-arr[index],res,size+1); 
            target(arr, index + 1, t, res, size);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] res=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        target(arr,0,t,res,0);
    }
}
