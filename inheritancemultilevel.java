class Animal{
    void eat(){
        System.out.println("animal eating");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("woww");
    }
}

class puppy extends dog{
    void mowning(){
        System.out.println("oooohaoo");
    }
}



public class inheritancemultilevel {
    public static void main(String[] args) {
        puppy ob=new puppy();      
        ob.eat();
    }
}
