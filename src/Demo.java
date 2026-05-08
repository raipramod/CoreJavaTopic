public class Demo {
    public static void main(String[] args) {

        int score = 75;
        char grade = 'B';

        if   (score >= 50) {
            System.out.println("Passed");
        } else if (score >= 75 && score <= 89) {
            System.out.println(grade);
        }

    }
}
