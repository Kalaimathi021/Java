import java.util.Scanner;

public class MaxProSubArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int i;
        int j=0;
        int pro=1;
        for(i=0;i<size;i++){
            i=j;
            while(j<size){
                pro*=arr[j];
                j++;
            }
        }
        System.out.println(pro);
    }
}
