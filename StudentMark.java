import java.util.Scanner;

public class StudentMark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub=sc.nextInt();
        int mar=sc.nextInt(); 
        int[][] arr=new int[sub][mar];
        for(int i=0;i<sub;i++){
            for(int j=0;j<mar;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<sub;i++){
            for(int j=0;j<mar;j++){
                sum+=arr[i][j];
                
            }
            System.out.println("Student "+i+" Total = "+sum);
            sum=0;
        }

    }
}
