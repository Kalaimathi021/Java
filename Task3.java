import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Number is zero");
        }
        else if(n>0){
            System.out.println("Number is positive");
        }
        else if(n<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
