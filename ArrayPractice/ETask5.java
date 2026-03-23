import java.util.Scanner;
class ETask5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        int oddcount=0;
        int evencount=0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                evencount++;
            }
            if(arr[i]%2!=0){
                oddcount++;
            }
        }
     
        System.out.println(evencount);
        System.out.println(oddcount);
        sc.close();
    }
}