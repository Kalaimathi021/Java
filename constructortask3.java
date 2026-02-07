public class constructortask3 {
    
    String name;
    int age;

    constructortask3(String a,int b){
        name=a;
        age=b;
    }

    public static void main(String[] args) {
        constructortask3 obj1=new constructortask3("kalai",18);
        constructortask3 obj2=new constructortask3("mathi",18);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
