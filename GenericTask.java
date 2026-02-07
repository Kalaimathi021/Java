class Student<T , U>{
        T name,dep;
        U rollno,age;
}
public class GenericTask {
    public static void main(String[]args){
    Student<String,Integer>s1=new Student<>();
    
    s1.name="kalai";
    s1.dep="cse";
    s1.rollno=2342;
    s1.age=19;
    System.out.println("name: "+s1.name);
    System.out.println("department: "+s1.dep);
    System.out.println("rollno: "+s1.rollno);
    System.out.println("age: "+s1.age);
    }
}
