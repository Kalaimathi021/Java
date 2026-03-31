import java.util.Scanner;
public class CombinationSum {
    static void comb(int arr[],int index,int t,int res[],int size) {
        if (t==0) {   
            for (int i=0;i<size;i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            return;
        }
        if (t<0) return; 
        for (int i=index;i<arr.length;i++) {
            res[size]=arr[i];  
            comb(arr,i,t-arr[i],res,size+1); 
        }
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
        comb(arr,0,t,res,0);
    }
}
