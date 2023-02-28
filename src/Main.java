import org.hillel.java.pro.homeworks.task3.car.Car;
import org.hillel.java.pro.homeworks.task3.person.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person person = new Person()
                .setFullName("Oscar Isaac")
                .setAge(43)
                .setJobTitle("Actor");

        System.out.println("person = " + person);

        System.out.println(" ------------ ");

        Car car = new Car();
        car.start();

    }
}