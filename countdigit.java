import java.util.Scanner;
public class countdigit {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    int num=sc.nextInt();
    int count=0;
    int i;
    while(num>0){
        int digit=num/10;
        count+=1;
        i++;
    }
    System.out.println(count);

    sc.close();
   } 

}
