import java.util.Scanner;
public class Combination{
    static void combination(char[] arr,int index,String current){
        if(current.length()>0){
            System.out.println(current);
        }
        for(int i=index;i<arr.length;i++){
            combination(arr,i+1,current+arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        char[] arr=new char[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }
        combination(arr,0,"");
    }
}