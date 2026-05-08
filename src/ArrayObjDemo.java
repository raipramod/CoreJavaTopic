class Student{
    int rollNo;
    String name;
    int age;



}

public class ArrayObjDemo {
    public static void main(String[] args) {

     Student s1 = new Student();
     s1.rollNo = 2;
     s1.age = 3;
     s1.name = "Rai";


        Student s2 = new Student();
        s2.rollNo = 2;
        s2.age = 3;
        s2.name = "Rai";


        Student student [] = new Student[4];
        student[0] = s1;
        student[1] = s2;

        System.out.println(" hi " +s1.rollNo);
    }
}
