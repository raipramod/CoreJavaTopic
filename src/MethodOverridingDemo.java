class Open{
    public int addNum(int a, int b){
        return a +b;
    }
}

class Close extends Open{
    public int addNum(int a, int b){
        return a - b;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        Close c = new Close();
       int d =  c.addNum(5,4);

        System.out.println(d);

    }
}
