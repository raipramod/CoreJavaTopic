class En{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

}

public class EnDemo {
    public static void main(String[] args) {

        En en = new En();

        en.setName("Java");

        System.out.println(en.getName());

    }
}
