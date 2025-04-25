import java.util.Scanner;
public class Arrayterm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,9};
        for(int ach:a){
            System.out.println(ach);
        }
        System.out.println("enter the size of an array ");
        int size=sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
            }
        for(int nums:num){
        System.out.println(nums);
        }
        
    }
}
