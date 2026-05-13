public class C1 {
    public static void main(String[] args) {

        AdC c = new AdC();
        int r1 = c.addNum(2,4);
        int r2 = c.sum(2,1);
        int r3 = c.divide(4,2);
        int r4 = c.multi(2,1);

        System.out.println(r1 + " "+r2 + " "+ r3 +""+r4);
    }
}
