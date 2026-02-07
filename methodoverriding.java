public class methodoverriding {
    
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        methodoverriding obj=new methodoverriding();
        obj.sum(23, 56);
        obj.sum(23, 56,45);
    }
}
