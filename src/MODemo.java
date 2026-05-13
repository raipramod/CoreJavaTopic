class Songs{
    public void playMusic(){
        System.out.println("Playing music");
    }

    int a;
    int b;
    int c;
    public int addNum(){
        return a+b;
    }

    public int addNum(int a, int b, int c){
        return a + b + c;
    }
}

public class MODemo {
    public static void main(String[] args) {

        Songs s = new Songs();
        s.playMusic();
        s.addNum();

        System.out.println(s.addNum());
        s.addNum();
        System.out.println(s.addNum());

    }
}
