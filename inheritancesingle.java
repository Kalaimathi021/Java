class dad{
    int money=10000;
}

class son extends dad{

}


public class inheritancesingle {
    public static void main(String[] args) {
        son obj1=new son();
        System.out.println(obj1.money);
    }
}
