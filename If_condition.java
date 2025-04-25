import java.util.Scanner;
public class If_condition {
    public static void main(String[] args) {
        System.out.println("enter number between 1 to 100");
        Scanner oii=new Scanner(System.in);
        int n = oii.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

        oii.close();
    }
}
