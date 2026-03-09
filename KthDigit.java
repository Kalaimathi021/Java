import java.util.Scanner;
public class KthDigit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        System.out.println("Enter power");
        int power=sc.nextInt();
        int result=(int)Math.pow(num, power);
        System.out.println("Enter digit");
        int kth=sc.nextInt();
        int digit=0;
        for(int i=1;i<kth;i++){
            digit=result%10;
            result=result/10;        
        }
    System.out.println(kth+" digit is "+ digit);
    sc.close();
    }
}
