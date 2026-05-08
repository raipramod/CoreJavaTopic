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

        Demos d = new Demos();
        d.playMusic();
       int result = Integer.parseInt(d.addNum(20));
        System.out.println(result);
    }
}
