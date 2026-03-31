import java.util.Scanner;
public class SubArrEveSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        String s="";
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    s+=arr[k]+" ";
                    
                }
                if(sum%2==0){
                    //System.out.println(sum);
                    System.out.println(s);
                }
                sum=0;
                s="";
            }
        }
    }
}
