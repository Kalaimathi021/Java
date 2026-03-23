import java.util.*;
public class SeatBooking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        int[] arr=new int[n];
        while (sc.hasNextInt()) {
            int i=sc.nextInt();
            if (arr[i]==0) {
                arr[i]=1;
                System.out.println("Seat "+i+" booked");
            } else {
                System.out.println("Seat "+i+" already booked");
            }
        }
        System.out.print("Final Seats: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}