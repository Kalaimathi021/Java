public class thisTask1 {
    
    String myname;

    thisTask1(){
        System.out.println("ohoo");
    }

    void name(String myname){
        this.myname=myname;
    }

    public static void main(String[] args) {
        thisTask1 obj1=new thisTask1();
        obj1.name("hari");
        System.out.println(obj1.myname);
    }
}
