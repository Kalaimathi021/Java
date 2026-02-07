public class constructorTask1 {
    int num;
    String name;

    constructorTask1(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        constructorTask1 obj1=new constructorTask1();
        //constructorTask1 obj2=new constructorTask1();
        System.out.println(obj1.name);
    }
}
