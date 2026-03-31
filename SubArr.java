import java.util.Scanner;

public class SubArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        for(int start=0;start<size;start++){
            int end=start;
            String s="";
            while(end<size){
                s+=arr[end]+" ";
                System.out.println(s);
                end++;
            } 
        }
    }
}    