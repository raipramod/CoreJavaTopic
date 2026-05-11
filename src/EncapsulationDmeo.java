
class Human{
   private String name;
     private int age;

     public int getAge(){
         return age;
     }
     public void setAge(int a){
         age=a;
     }

     public String getName(String rai){
         return name;
     }

     public void setName(String n){
         name=n;
     }
}


public class EncapsulationDmeo {
    public static void main(String[] args) {

        Human h = new Human();
/*
        h.age = 30;
        h.name = "rai";

        System.out.println(h.age);
        System.out.println(h.name);*/
        //  h.getAge();

        h.setAge(30);
        h.setName("Rai");

        //System.out.println(h.getAge());
        System.out.println(h.getAge());





    }
}
