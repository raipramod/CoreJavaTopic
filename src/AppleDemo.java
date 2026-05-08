class D{
    public int add(int i, int i1){
        int a = 3;
        int b = 4;
        int result = a * b;
        return result;
    }
}
public class AppleDemo {
    public static void main(String[] args) {
        D d = new D();
       int result = d.add(3, 4);

        System.out.println(result);
    }
}
