class One {
    public void displayMe(){

        System.out.println("in One");
    }


}

class Two extends One{
    public void helloMe(){
        System.out.println("in two");
    }
}


public class DownDemo {
    public static void main(String[] args) {

        Two t = (Two) new One();

        //One o = new Two();
//        t.displayMe();

        t.helloMe();


    }
}
