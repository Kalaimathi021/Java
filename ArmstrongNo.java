import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNo {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int org=num;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        int rem;
        int arms=0;
        while(num!=0){
            rem=num%10;
            arms=(int)Math.pow(rem,count);
            num=num/10;
        }
        if(org==arms){
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armstrong");
        }

        sc.close();
    }
}
