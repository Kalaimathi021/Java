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

class cat extends Animal{
    void meow(){
        System.out.println("meowwww");
    }
}

class puppy extends dog{
    void mowning(){
        System.out.println("oooohaoo");
    }
}

public class inheritancehybrid {
    public static void main(String[] args) {
        cat ob=new cat();
        ob.eat();
    }
}
