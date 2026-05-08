
class demo{

    public int add(int n1, int n2) // method definition
    {

        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){

        return n1+n2+n3;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        demo d = new demo(); // object creation
       int result =  d.add(34, 3); // parameter pass
       int r = d.add(1,2,3);
        System.out.println(result);
        System.out.println(r);

    }
}
