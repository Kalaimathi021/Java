import java.util.Scanner;
class Watch{
    private String brand;
    private String type;
    private double price;

    void setBrand(String brand){
        this.brand=brand;
    }
    void setType(String type){
        this.type=type;
    }
    void setPrice(double price){
        this.price=price;
    }
    String getBrand(){
        return brand;
    }
    String getType(){
        return type;
    }
    double getPrice(){
        return price;
    }
    double increasePrice(int percent,double price){
        return price+(price*percent/100);
       
       
    }
}
public class ENTask1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Watch obj=new Watch();
        String brand=sc.next();
        String type=sc.next();
        double price=sc.nextDouble();
        int percent=sc.nextInt();
        obj.setBrand(brand);
        obj.setType(type);
        obj.setPrice(price);
        System.out.println("Brand: "+obj.getBrand());
        System.out.println("Type: "+obj.getType());
        System.out.println("Price after increase: "+obj.increasePrice(percent, price));

        sc.close();
    }
}
