import java.util.Scanner;
public class swap {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" ,b="+b);
        sc.close();
    }
}
