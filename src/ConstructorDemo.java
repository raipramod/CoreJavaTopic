class Cat {
    // initialize varibbles inside the cat class
    private String name;
    private int age;

    public Cat(){
        System.out.println("Inside constructor");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();

    }
}
