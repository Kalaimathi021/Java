class Vehicle{
    void vehicle(){
    System.out.println("Vehicle order");
    }
}
class Car extends Vehicle{
    void car(){
    System.out.println("Vehicle : Car");
    }
}
class car1 extends Car{
    void carType(){
    System.out.println("Car : Car1");
    }
}
class Bike extends Vehicle{
    void bike(){
    System.out.println("Vehicle : Bike ");
    }
}
class Truck extends Vehicle{
    void truck(){
    System.out.println("Vehicle : Truck");
    }
} 

public class Task14 {
    public static void main(String[] args){
        Vehicle vh=new Vehicle();
        Car ca=new Car();
        vh.vehicle();
        ca.car();
    }
}
