
class Calculator {

    public int addSum(int n1, int n2){
        //System.out.println(int n1, n2);
        int r = n1 + n2;
        return r;
    }
}

public class ClassDmeo {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
       // int demo = a + b;

        Calculator c = new Calculator();
        int result;
        result = c.addSum(a,b);

        System.out.println(result);
    }
}
