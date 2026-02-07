import java.util.Scanner;
public class ReverseNo {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num : ");
        int num=sc.nextInt();
        int rem;
        int rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        sc.close();
    }
    
}
