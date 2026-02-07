class Student{
    String name;
    static String college="RTC";
    int rollno,age;

    void display(){
        System.out.println(name);
        System.out.println(college);
        System.out.println(rollno);
        System.out.println(age);
    }
}
public class Main {
    public static void main(String[]args){
        Student obj=new Student();
        obj.name="kalai";
        obj.rollno=7578897;
        obj.age=21;

        obj.display();
    }
}
