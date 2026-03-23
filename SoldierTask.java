import java.util.Scanner;

public class SoldierTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int power=1;
        while (power*2<=n) {
            power*=2;
        }
        int l=n-power;
        int survivor=2*l+1;
        System.out.println(survivor);
    }
}
