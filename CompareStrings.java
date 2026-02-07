public class CompareStrings{
    public static void main(String []args){
        String a="apple";
        String b="apple";
        String c="banana";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String f1=new String("banana");
        String f2=new String("banana");
        System.out.println(f1==f2);
        System.out.println(f1.equals(f2));
        System.out.println(c.equals(f1));
    }
}



