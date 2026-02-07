public class constructortask2 {
    
    constructortask2(){
        System.out.println("hi i am empty");
    }

    constructortask2(int a){
        System.out.println(a);
        System.out.println("achooooo");
    }

    public static void main(String[] args) {
        constructortask2 obj1=new constructortask2();
        constructortask2 obj2=new constructortask2(100);
    }
}
