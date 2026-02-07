class Box<T> {
    private T value;
    public void setValue(T value) {   
        this.value = value;
    }
    public T getValue() {             
        return value;
    }
}
public class GenericTask1{
    public static void main(String[] args) {       
        Box<String> s1 = new Box<>();

    }
}