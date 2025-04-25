import java.util.Scanner;
public class Switch_condition {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enetr number 1 to 7");
        int day = sc.nextInt();
        switch(day){
            case 1:
                if(day==1){
                    System.out.println("sunday");
                }
                break;
            case 2:
                if(day==2){
                    System.out.println("monday");
                }
                break;

            case 3:
                if(day==3){
                    System.out.println("tuesday");
                }
                break;

            case 4:
                if(day==4){
                    System.out.println("wednesday");
                }
                break;

            case 5:
                if(day==5){
                    System.out.println("thursday");
                }
                break;

            case 6:
                if(day==6){
                    System.out.println("friday");
                }
                break;

            case 7:
                if(day==7){
                    System.out.println("saturday");
                }
                break; 

            default:
                System.out.println("enter valid number");
                break;

        }
        sc.close();
    }
}
