package org.hillel.java.pro.homeworks;

import org.hillel.java.pro.homeworks.task4.Animals;
import org.hillel.java.pro.homeworks.task4.Cat;
import org.hillel.java.pro.homeworks.task4.Dog;

public class Main {
    public static void main(String[] args) {

        Animals dogBob = new Dog();
        dogBob.Run(120);
        dogBob.Run(800);

        dogBob.Swim(500);
        dogBob.Swim(5);

        Animals cat1 = new Cat();
        cat1.Run(150);
        cat1.Run(300);

        cat1.Swim(5);

        Animals cat2 = new Cat();
        cat2.Run(150);
        cat2.Run(300);

        System.out.println("Створено тварин : " +Animals.getCountEntities());
        System.out.println("Створено собак : "  +Dog.getCountDogs());
        System.out.println("Створено котів : "  +Cat.getCountCats());




    }
}