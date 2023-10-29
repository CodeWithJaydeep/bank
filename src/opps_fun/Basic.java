package opps_fun;

public class Basic {

    public static void main(String[] args) {
//        System.out.println("Hello world");
//        Create new method
        Person p1 = new Person();
        p1.age=25;
        p1.name="Jaydeep";

        System.out.println(p1.age+ ""+p1.name);

    }
}

class Person{
    String name;
    int age;
}
