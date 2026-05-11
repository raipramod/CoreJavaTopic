class Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class GetSetDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.setAge(20);
        d.setName("Jack");

        System.out.println(d.getAge() + " " + d.getName());


    }
}
