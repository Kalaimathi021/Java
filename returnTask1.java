import java.util.Scanner;

public class returnTask1 {
    //void can't return 
    int sum(int a,int b){
        int add=a+b;
        return add;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        returnTask1 obj1=new returnTask1();
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        int add=obj1.sum(a,b);
        System.out.println(add);

        sc.close();
    }
    
}
