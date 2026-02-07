public class returnTask2 {
    
    String getname(){
        return "kalai";
    }

    int getid(){
        return 5;
    }

    public static void main(String[] args) {
        returnTask2 obj1=new returnTask2();
        String name=obj1.getname();
        int id=obj1.getid();
        System.out.println(name);
        System.out.println(id);
    }
}
