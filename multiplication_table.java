import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        System.out.println("enter which table");
        int num=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+" * "+num+" = "+i*num);
        }
        sc.close();
    }
}
