import java.util.Scanner;

public class ProductSale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pro=sc.nextInt();
        int day=sc.nextInt();
        int[][] stock=new int[pro][day];
        int[][] sale=new int[pro][day];
        for(int i=0;i<pro;i++){
            for(int j=0;j<day;j++){
                stock[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<pro;i++){
            for(int j=0;j<day;j++){
                sale[i][j]=sc.nextInt();
            }
        }
        int diff=0;
        int[][] arr=new int[pro][day];
        for(int i=0;i<pro;i++){
            for(int j=0;j<day;j++){
                arr[i][j]=stock[i][j]-sale[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
