import java.util.Scanner;
public class arrayTask1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //int[] arr1={34,56,34,667,45,90};
       //System.out.println(arr1[3]);
       int[] arr=new int[5];
       //arr[0]=sc.nextInt(); 
       //arr[2]=sc.nextInt(); 
       //arr[1]=sc.nextInt(); 
       //arr[3]=sc.nextInt(); 
       //arr[4]=sc.nextInt();
     
      // System.out.println(arr[3]);
       //int sum=0;
         for(int i=1;i<=4;i=i+1){
            arr[i]=sc.nextInt();
       }
       int sum=0;
       for(int i=1;i<arr.length;i++){
        //System.out.println(arr[i]);
        sum+=arr[i];
       }
       System.out.println(sum);
       for(int i=1;i<arr.length;i++){
        System.out.println(arr[i]);
        
       }

       sc.close();
    }
}
