import java.util.*;
public class SquareRootTask {

    public int Sr(int num){
        int low=0;
        int high=num;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==num){
                return mid;
            }
            if(mid*mid<num){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
       }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        SquareRootTask obj=new SquareRootTask();
        System.out.println(obj.Sr(num));
        sc.close();
    }
}
