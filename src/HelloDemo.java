class Demos{

    public void playMusic(){
        System.out.println("Hi I am playing music");
    }

    public String addNum(int cost){
        int a = 2;
        int b = 3;
        int result = a + b;
        if (result > 1){
            return "Pen";
           // return "nothing";
        }
        else {
            return "Error";
        }
    }
}
public class HelloDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
       d.setName("Dog");

        System.out.println(d.getName());
    }
}
