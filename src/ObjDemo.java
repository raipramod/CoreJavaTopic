class C{

    public int multi(int a, int b){
        int result = 5 * 6;
        System.out.println("Multi :" +result);
        return result;
    }
}


public class ObjDemo {
    public static void main(String[] args) {

        C m = new C();
        m.multi(5,6);

    }
}
