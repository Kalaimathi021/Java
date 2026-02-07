class Laptop{
    String name="";
    String version="";
    int price=0;
}
    public static void main(String[] args) {
        Laptop lap1=new Laptop();
        lap1.name="lenovo";
        lap1.version="i5";
        lap1.price=2500000;

        Laptop lap2=new Laptop();
        lap2.name="hp";
        lap2.version="i5";
        lap2.price=2600000;

        Laptop lap3=new Laptop();
        System.out.println(lap2.price);
    }

