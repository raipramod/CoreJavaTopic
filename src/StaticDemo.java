class Cor{
   static String name;
    int age;

    public void displayAll(){
        System.out.println(age + " " + name);
    }

}

public class StaticDemo {
    public static void main(String[] args) {

        Cor c = new Cor();

        c.age = 20;
        c.name = "j";

        Cor c1 = new Cor();
        c1.name ="K";
        c1.age = 10;
        c1.name = "Apple";

        c.displayAll();
        c1.displayAll();

    }
}
