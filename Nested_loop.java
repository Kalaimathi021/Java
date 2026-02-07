public class Nested_loop {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println(i+" "+j);
                
            }
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
