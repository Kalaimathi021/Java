import java.util.Scanner;

public class parameterTask1 {
    
    void add(int a,int b){
        int sum=a+b;
        System.err.println(sum);
    }
    void mul(int a,int b){
        int mull=a*b;
        System.err.println(mull);
    }
    void div(int a,int b){
        int divi=0;
        if(b!=0){
            divi=a/b;
        }
        System.err.println(divi);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        parameterTask1 obj1=new parameterTask1();
        System.out.println("Enter a : ");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        obj1.add(a,b);
        obj1.mul(a,b);
        obj1.div(a,b);
        sc.close();
    }
}
