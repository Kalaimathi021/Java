public class find {
    
    void evenorodd(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        find obj1=new find();
        obj1.evenorodd(23);
    }
}
