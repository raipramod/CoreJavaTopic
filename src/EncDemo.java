class HeadPhone{
    int price =20;
    String name = "abc";

    public String printName(){
        return name;
    }
}


class Machine extends HeadPhone{

    int make = 1997;
    public int printAll(){
        return make;
    }
}

public class EncDemo {
    public static void main(String[] args) {

        Machine m = new Machine();
        m.printAll();
       String s = m.printName();
        System.out.println(s);
        System.out.println(m.printAll());

    }
}


