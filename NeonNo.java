import java.util.Scanner;
public class NeonNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sqr=num*num;
        int org=num;
        int sum=0;
        int rem;
        while(sqr!=0){
            rem=sqr%10;
            sum+=rem;
            sqr=sqr/10;

        }
        if(sum==org){
            System.out.println("neon");
        }else{
            System.out.println("not neon");
        }

        sc.close();
    }
}
