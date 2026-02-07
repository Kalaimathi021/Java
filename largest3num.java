import java.util.Scanner;
public class largest3num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Enter num3");
        int num3=sc.nextInt();
        if((num1>num2) && (num1>num3)){
            System.out.println("largest:"+num1);
        }else if(num2>num3){
            System.out.println("largest:"+num2);
        }else{
            System.out.println("largest:"+num3);
        }
        sc.close();
    }
}
