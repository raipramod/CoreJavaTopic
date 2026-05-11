public class StringBufferBuilderDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Rai");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" java"));
        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(0, "ja");
        System.out.println(sb);

        sb.setLength(40);
        System.out.println(sb);
    }

}
