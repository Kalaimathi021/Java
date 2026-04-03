import java.util.Scanner;
class Aeroplane{
    private String planeNumber;
    private String airline;
    private int fuelCapacity;
    void setPlaneNumber(String planeNumber){
        this.planeNumber=planeNumber;
    }
    void setAirline(String airline){
        this.airline=airline;
    }
    void setFuelCapacity(int fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    String getPlaneNumber(){
        return planeNumber;
    }
    String getAirline(){
        return airline;
    }
    int getFuelCapacity(){
        return fuelCapacity;
    }
    int refuel(int amount){
        return fuelCapacity+amount;
    }
}

public class ENTask2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Aeroplane obj=new Aeroplane();
        String planeNumber=sc.next();
        String airline=sc.next();
        int fuelCapacity=sc.nextInt();
        int amount=sc.nextInt();
        obj.setPlaneNumber(planeNumber);
        obj.setAirline(airline);
        obj.setFuelCapacity(fuelCapacity);
        System.out.println("Plane Number: "+obj.getPlaneNumber());
        System.out.println("Airline: "+obj.getAirline());
        System.out.println("Fuel Capacity after refuel: "+obj.refuel(amount));
    }
}
