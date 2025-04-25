import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        System.out.println("Enter phone number : ");
        double phone_no=sc.nextDouble();
        System.out.println("Enter cgpa : ");
        float cgpa=sc.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone_no);
        System.out.println(cgpa);
 
        sc.close();
    }
    
}
